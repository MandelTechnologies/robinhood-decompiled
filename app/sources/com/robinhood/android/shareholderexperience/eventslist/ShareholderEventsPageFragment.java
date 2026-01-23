package com.robinhood.android.shareholderexperience.eventslist;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.shareholder.view.UtilsKt;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunk2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment;
import com.robinhood.android.shareholderexperience.questionlist.DropdownType;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.ShareholderEventNavigationRow;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shareholderx.models.p401db.DropdownItem;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsPage;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ShareholderEventsPageFragment.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001JB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010-\u001a\u00020.H\u0017¢\u0006\u0002\u0010/J/\u00100\u001a\u00020.2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u000208H\u0003¢\u0006\u0002\u00109J%\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020<2\u0006\u00103\u001a\u0002042\u0006\u0010=\u001a\u00020>H\u0003¢\u0006\u0002\u0010?J&\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020\u00172\u0006\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0EH\u0002J\u0018\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020CH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00060'j\u0002`(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006K²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownSelectionBottomSheetFragment$Callbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "duxo", "Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageDuxo;", "getDuxo", "()Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "instrumentId", "Ljava/util/UUID;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "asset", "Lcom/robinhood/rosetta/eventlogging/Asset;", "getAsset", "()Lcom/robinhood/rosetta/eventlogging/Asset;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "ShareholderEventsPageComposable", "viewState", "Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageViewState;", "callbacks", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;", "eventsPage", "Lcom/robinhood/shareholderx/models/db/ShareholderEventsPage;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageViewState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;Lcom/robinhood/shareholderx/models/db/ShareholderEventsPage;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EventSection", "eventsSection", "Lcom/robinhood/shareholderx/models/db/ShareholderEventsPage$EventSection;", "isLoading", "", "(Lcom/robinhood/shareholderx/models/db/ShareholderEventsPage$EventSection;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;ZLandroidx/compose/runtime/Composer;I)V", "showFilterBottomSheet", "title", "selectedFilter", "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "filters", "", "onItemSelected", "dropdownType", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownType;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ShareholderEventsPageFragment extends GenericComposeFragment implements AutoLoggableFragment, DropdownSelectionBottomSheetFragment.Callbacks {
    private static final String FILTER_SHEET_TAG = "filtersBottomSheet";
    public EventLogger eventLogger;
    private UUID instrumentId;
    public Markwon markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final Screen eventScreen = new Screen(Screen.Name.SHAREHOLDER_EVENTS_LIST, null, null, null, 14, null);
    private final String screenName = getEventScreen().getName().name();

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, ShareholderEventsPageDuxo.class);
    private final Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, getAsset(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(ShareholderEventsPageFragment shareholderEventsPageFragment, int i, Composer composer, int i2) {
        shareholderEventsPageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(ShareholderEventsPageFragment shareholderEventsPageFragment, int i, Composer composer, int i2) {
        shareholderEventsPageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventSection$lambda$15(ShareholderEventsPageFragment shareholderEventsPageFragment, ShareholderEventsPage.EventSection eventSection, SduiActionHandler2 sduiActionHandler2, boolean z, int i, Composer composer, int i2) {
        shareholderEventsPageFragment.EventSection(eventSection, sduiActionHandler2, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareholderEventsPageComposable$lambda$10(ShareholderEventsPageFragment shareholderEventsPageFragment, ShareholderEventsPageViewState shareholderEventsPageViewState, SduiActionHandler2 sduiActionHandler2, ShareholderEventsPage shareholderEventsPage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        shareholderEventsPageFragment.ShareholderEventsPageComposable(shareholderEventsPageViewState, sduiActionHandler2, shareholderEventsPage, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, this.context, null, null, 109, null);
    }

    private final ShareholderEventsPageDuxo getDuxo() {
        return (ShareholderEventsPageDuxo) this.duxo.getValue();
    }

    private final Asset getAsset() {
        String string2;
        Asset asset = new Asset(null, Asset.AssetType.INSTRUMENT, null, null, 13, null);
        UUID uuid = this.instrumentId;
        return (uuid == null || (string2 = uuid.toString()) == null) ? asset : Asset.copy$default(asset, string2, null, null, null, 14, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1210623473);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1210623473, i2, -1, "com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment.ComposeContent (ShareholderEventsPageFragment.kt:81)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new ShareholderEventsPageViewState(null, false, 3, null), composerStartRestartGroup, 0);
            ShareholderEventsPage eventsPage = ComposeContent$lambda$1(snapshotState4SubscribeAsState).getEventsPage();
            composerStartRestartGroup.startReplaceGroup(-526974039);
            if (eventsPage == null) {
                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 0, composerStartRestartGroup, 48, 13);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ShareholderEventsPageFragment.ComposeContent$lambda$3$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.endReplaceGroup();
            EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, getEventScreen(), null, null, this.context, 13, null);
            Navigator navigator = getNavigator();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShareholderEventsPageFragment.ComposeContent$lambda$5$lambda$4(this.f$0, (GenericAlertContent) obj, (SduiActionHandler6) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ShareholderEventsPageComposable(ComposeContent$lambda$1(snapshotState4SubscribeAsState), SduiChunk2.rememberDefaultSduiChunkCallbacks(navigator, (Function2) objRememberedValue, null, composerStartRestartGroup, 0, 4), eventsPage, WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), composerStartRestartGroup, 57344 & (i2 << 12), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShareholderEventsPageFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ShareholderEventsPageViewState ComposeContent$lambda$1(SnapshotState4<ShareholderEventsPageViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(ShareholderEventsPageFragment shareholderEventsPageFragment, GenericAlertContent alert, SduiActionHandler6 callbacks) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        SduiAlertKt.presentSduiAlertSheet(shareholderEventsPageFragment, shareholderEventsPageFragment.getMarkwon(), alert, callbacks, (1016 & 8) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SduiAlertKt.presentSduiAlertSheet$lambda$0((String) obj);
            }
        } : null, (1016 & 16) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SduiAlertKt.presentSduiAlertSheet$lambda$1((String) obj);
            }
        } : null, (1016 & 32) != 0 ? new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : null, (1016 & 64) != 0 ? false : false, (1016 & 128) != 0 ? false : false, (1016 & 256) != 0, (1016 & 512) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ShareholderEventsPageComposable(final ShareholderEventsPageViewState shareholderEventsPageViewState, final SduiActionHandler2 sduiActionHandler2, ShareholderEventsPage shareholderEventsPage, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        SduiActionHandler2 sduiActionHandler22;
        final ShareholderEventsPage shareholderEventsPage2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ShareholderEventsPage.EventSection newEvents;
        ShareholderEventsPage.EventSection pastEvents;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-439878079);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(shareholderEventsPageViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                sduiActionHandler22 = sduiActionHandler2;
                i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler22) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    shareholderEventsPage2 = shareholderEventsPage;
                    i3 |= composerStartRestartGroup.changedInstance(shareholderEventsPage2) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    if ((i2 & 16) != 0) {
                        if ((i & 24576) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(this) ? 16384 : 8192;
                        }
                        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        } else {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-439878079, i3, -1, "com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment.ShareholderEventsPageComposable (ShareholderEventsPageFragment.kt:119)");
                            }
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                            Modifier modifier5 = modifier4;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                            String pageTitle = shareholderEventsPage2.getPageTitle();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            int i6 = i3;
                            BentoText2.m20747BentoText38GnDrw(pageTitle, PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8184);
                            BentoText2.m20747BentoText38GnDrw(shareholderEventsPage2.getPageSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                            composerStartRestartGroup = composerStartRestartGroup;
                            newEvents = shareholderEventsPage2.getNewEvents();
                            composerStartRestartGroup.startReplaceGroup(-541771086);
                            if (newEvents != null) {
                                EventSection(newEvents, sduiActionHandler22, shareholderEventsPageViewState.isLoading(newEvents), composerStartRestartGroup, (i6 & 112) | ((i6 >> 3) & 7168));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            pastEvents = shareholderEventsPage2.getPastEvents();
                            composerStartRestartGroup.startReplaceGroup(-541762504);
                            if (pastEvents != null) {
                                EventSection(pastEvents, sduiActionHandler2, shareholderEventsPageViewState.isLoading(pastEvents), composerStartRestartGroup, (i6 & 112) | ((i6 >> 3) & 7168));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ShareholderEventsPageFragment.ShareholderEventsPageComposable$lambda$10(this.f$0, shareholderEventsPageViewState, sduiActionHandler2, shareholderEventsPage2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    if ((i3 & 9363) == 9362) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        Modifier modifier52 = modifier4;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            String pageTitle2 = shareholderEventsPage2.getPageTitle();
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i52 = BentoTheme.$stable;
                            TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            int i62 = i3;
                            BentoText2.m20747BentoText38GnDrw(pageTitle2, PaddingKt.m5145paddingqDBjuR0(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8184);
                            BentoText2.m20747BentoText38GnDrw(shareholderEventsPage2.getPageSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                            composerStartRestartGroup = composerStartRestartGroup;
                            newEvents = shareholderEventsPage2.getNewEvents();
                            composerStartRestartGroup.startReplaceGroup(-541771086);
                            if (newEvents != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            pastEvents = shareholderEventsPage2.getPastEvents();
                            composerStartRestartGroup.startReplaceGroup(-541762504);
                            if (pastEvents != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                if ((i2 & 16) != 0) {
                }
                if ((i3 & 9363) == 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            shareholderEventsPage2 = shareholderEventsPage;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        sduiActionHandler22 = sduiActionHandler2;
        if ((i2 & 4) == 0) {
        }
        shareholderEventsPage2 = shareholderEventsPage;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private final void EventSection(final ShareholderEventsPage.EventSection eventSection, final SduiActionHandler2 sduiActionHandler2, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-145472248);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(eventSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-145472248, i2, -1, "com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment.EventSection (ShareholderEventsPageFragment.kt:166)");
            }
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            BentoText2.m20747BentoText38GnDrw(eventSection.getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
            composerStartRestartGroup = composerStartRestartGroup;
            final ShareholderEventsPage.FiltersSelection filters = eventSection.getFilters();
            composerStartRestartGroup.startReplaceGroup(2071309097);
            if (filters != null) {
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(eventSection) | composerStartRestartGroup.changedInstance(filters);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ShareholderEventsPageFragment.EventSection$lambda$14$lambda$13$lambda$12$lambda$11(this.f$0, eventSection, filters);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, filters.getSelectedFilter().getLabel(), null, new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.CARET_DOWN_16, BentoTextButton3.Icon.Position.Trailing), null, false, null, composerStartRestartGroup, BentoTextButton3.Icon.Size12.$stable << 9, 116);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) eventSection.getEvents());
            ShareholderEventNavigationRow shareholderEventNavigationRow = objFirstOrNull instanceof ShareholderEventNavigationRow ? (ShareholderEventNavigationRow) objFirstOrNull : null;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, Context.copy$default(this.context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, shareholderEventNavigationRow != null ? UtilsKt.getLoggingContext(shareholderEventNavigationRow) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1025, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1696482749, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment.EventSection.2
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
                        ComposerKt.traceEventStart(1696482749, i4, -1, "com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment.EventSection.<anonymous> (ShareholderEventsPageFragment.kt:211)");
                    }
                    if (z) {
                        composer2.startReplaceGroup(1037440815);
                        PlaceholderKt.ShareholderEventNavigationRowPlaceholder(eventSection.getEvents(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1037725116);
                        ImmutableList3 persistentList = extensions2.toPersistentList(eventSection.getEvents());
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null);
                        SduiActionHandler2 sduiActionHandler22 = sduiActionHandler2;
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierM5146paddingqDBjuR0$default, null, sduiActionHandler22, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 100663296, 0);
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.shareholderexperience.eventslist.ShareholderEventsPageFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShareholderEventsPageFragment.EventSection$lambda$15(this.f$0, eventSection, sduiActionHandler2, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventSection$lambda$14$lambda$13$lambda$12$lambda$11(ShareholderEventsPageFragment shareholderEventsPageFragment, ShareholderEventsPage.EventSection eventSection, ShareholderEventsPage.FiltersSelection filtersSelection) {
        shareholderEventsPageFragment.showFilterBottomSheet(eventSection.getTitle(), filtersSelection.getSelectedFilter(), filtersSelection.getAllFilters());
        return Unit.INSTANCE;
    }

    private final void showFilterBottomSheet(String title, DropdownItem selectedFilter, List<DropdownItem> filters) {
        DropdownSelectionBottomSheetFragment dropdownSelectionBottomSheetFragment = (DropdownSelectionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(DropdownSelectionBottomSheetFragment.INSTANCE, new DropdownSelectionBottomSheetFragment.Args(DropdownType.FILTER, selectedFilter, filters, title), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        dropdownSelectionBottomSheetFragment.show(parentFragmentManager, FILTER_SHEET_TAG);
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.DropdownSelectionBottomSheetFragment.Callbacks
    public void onItemSelected(DropdownType dropdownType, DropdownItem item) {
        Intrinsics.checkNotNullParameter(dropdownType, "dropdownType");
        Intrinsics.checkNotNullParameter(item, "item");
        getDuxo().filterEventsPage(item.getValue());
    }

    /* compiled from: ShareholderEventsPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/shareholderexperience/eventslist/ShareholderEventsPageFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventsPage;", "<init>", "()V", "FILTER_SHEET_TAG", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ShareholderEventsPageFragment, LegacyFragmentKey.ShareholderEventsPage> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.ShareholderEventsPage shareholderEventsPage) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, shareholderEventsPage);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ShareholderEventsPage getArgs(ShareholderEventsPageFragment shareholderEventsPageFragment) {
            return (LegacyFragmentKey.ShareholderEventsPage) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, shareholderEventsPageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ShareholderEventsPageFragment newInstance(LegacyFragmentKey.ShareholderEventsPage shareholderEventsPage) {
            return (ShareholderEventsPageFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, shareholderEventsPage);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ShareholderEventsPageFragment shareholderEventsPageFragment, LegacyFragmentKey.ShareholderEventsPage shareholderEventsPage) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, shareholderEventsPageFragment, shareholderEventsPage);
        }
    }
}
