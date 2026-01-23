package com.robinhood.android.feature.margin.maintenance.table;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import bonfire.proto.idl.margin.p036v1.InstrumentType;
import bonfire.proto.idl.margin.p036v1.MaintenanceTableActionDto;
import bonfire.proto.idl.margin.p036v1.TableSortAction;
import bonfire.proto.idl.margin.p036v1.ViewInstrumentAction;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment;
import com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableState4;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.generic.table.GenericChildRow;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableAction;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.lib.margin.hub.MarginHubStore;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.margin.contracts.MarginMaintenanceTableFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.MarginHealthState;
import com.robinhood.rosetta.eventlogging.MarginHealthStateDto;
import com.robinhood.rosetta.eventlogging.Screen;
import com.squareup.wire.AnyMessage;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.Alert;
import rh_server_driven_ui.p531v1.AlertAction;
import rh_server_driven_ui.p531v1.AlertDto;
import rh_server_driven_ui.p531v1.DeepLinkAction;
import rh_server_driven_ui.p531v1.GenericAction;

/* compiled from: MarginMaintenanceTableFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\r\u0010!\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\"R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R/\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "<set-?>", "Lrh_server_driven_ui/v1/AlertDto;", "alert", "getAlert", "()Lrh_server_driven_ui/v1/AlertDto;", "setAlert", "(Lrh_server_driven_ui/v1/AlertDto;)V", "alert$delegate", "Landroidx/compose/runtime/MutableState;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-margin-maintenance-table_externalDebug", "viewState", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableViewState;", "showAppBarTitle"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarginMaintenanceTableFragment extends GenericComposeFragment {
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MarginMaintenanceTableDuxo.class);

    /* renamed from: alert$delegate, reason: from kotlin metadata */
    private final SnapshotState alert = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(MarginMaintenanceTableFragment marginMaintenanceTableFragment, int i, Composer composer, int i2) {
        marginMaintenanceTableFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginMaintenanceTableDuxo getDuxo() {
        return (MarginMaintenanceTableDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AlertDto getAlert() {
        return (AlertDto) this.alert.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAlert(AlertDto alertDto) {
        this.alert.setValue(alertDto);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(532634544);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(532634544, i2, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent (MarginMaintenanceTableFragment.kt:82)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$actionHandler$1$1

                    /* compiled from: MarginMaintenanceTableFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$actionHandler$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[InstrumentType.values().length];
                            try {
                                iArr[InstrumentType.EQUITY_UNSPECIFIED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[InstrumentType.OPTION.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[InstrumentType.INDEX_OPTION.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[InstrumentType.FUTURES.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[InstrumentType.EVENT_CONTRACT.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(bonfire.proto.idl.margin.p036v1.MaintenanceTableAction action) {
                        LegacyFragmentKey.EquityInstrumentDetail equityInstrumentDetail;
                        IndexDetailPageFragmentKey indexDetailPageFragmentKey;
                        AlertAction alert;
                        Intrinsics.checkNotNullParameter(action, "action");
                        GenericAction generic = action.getGeneric();
                        Alert alert2 = null;
                        UUID uuidFromString = null;
                        alert2 = null;
                        if ((generic != null ? generic.getDeeplink() : null) != null) {
                            Navigator navigator = this.this$0.getNavigator();
                            Context context2 = context;
                            GenericAction generic2 = action.getGeneric();
                            DeepLinkAction deeplink = generic2 != null ? generic2.getDeeplink() : null;
                            if (deeplink == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context2, Uri.parse(deeplink.getUrl()), null, null, false, null, 60, null);
                            return true;
                        }
                        GenericAction generic3 = action.getGeneric();
                        if ((generic3 != null ? generic3.getDismiss() : null) != null) {
                            this.this$0.setAlert(null);
                            return super/*com.robinhood.android.common.ui.BaseFragment*/.onBackPressed();
                        }
                        GenericAction generic4 = action.getGeneric();
                        if ((generic4 != null ? generic4.getAlert() : null) != null) {
                            MarginMaintenanceTableFragment marginMaintenanceTableFragment = this.this$0;
                            AlertDto.Companion companion = AlertDto.INSTANCE;
                            GenericAction generic5 = action.getGeneric();
                            if (generic5 != null && (alert = generic5.getAlert()) != null) {
                                alert2 = alert.getAlert();
                            }
                            if (alert2 != null) {
                                marginMaintenanceTableFragment.setAlert(companion.fromProto(alert2));
                                return true;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (action.getTable_sort() != null) {
                            MarginMaintenanceTableDuxo duxo = this.this$0.getDuxo();
                            TableSortAction table_sort = action.getTable_sort();
                            if (table_sort == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            String sort_by = table_sort.getSort_by();
                            TableSortAction table_sort2 = action.getTable_sort();
                            if (table_sort2 != null) {
                                duxo.refresh(new MarginHubStore.MarginMaintenanceTableSortParams(sort_by, table_sort2.getSort_direction()));
                                return true;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (action.getView_instrument() == null) {
                            return false;
                        }
                        ViewInstrumentAction view_instrument = action.getView_instrument();
                        if (view_instrument == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String symbol = view_instrument.getSymbol();
                        try {
                            uuidFromString = UUID.fromString(view_instrument.getId());
                        } catch (Exception unused) {
                        }
                        UUID uuid = uuidFromString;
                        if (symbol == null && uuid == null) {
                            throw new IllegalStateException("Either symbol or id must be present");
                        }
                        int i3 = WhenMappings.$EnumSwitchMapping$0[view_instrument.getInstrument_type().ordinal()];
                        if (i3 == 1) {
                            Navigator navigator2 = this.this$0.getNavigator();
                            Context context3 = context;
                            if (symbol != null) {
                                equityInstrumentDetail = new LegacyFragmentKey.EquityInstrumentDetail(symbol, InstrumentDetailSource.NONE, ((MarginMaintenanceTableFragmentKey) MarginMaintenanceTableFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountNumber());
                            } else {
                                MarginMaintenanceTableFragment marginMaintenanceTableFragment2 = this.this$0;
                                if (uuid != null) {
                                    equityInstrumentDetail = new LegacyFragmentKey.EquityInstrumentDetail(uuid, null, ((MarginMaintenanceTableFragmentKey) MarginMaintenanceTableFragment.INSTANCE.getArgs((Fragment) marginMaintenanceTableFragment2)).getAccountNumber(), InstrumentDetailSource.NONE, false, 18, null);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            Navigator.DefaultImpls.showFragment$default(navigator2, context3, equityInstrumentDetail, false, false, false, null, false, null, false, false, null, null, 4084, null);
                            return true;
                        }
                        if (i3 == 2) {
                            Navigator navigator3 = this.this$0.getNavigator();
                            Context context4 = context;
                            if (uuid != null) {
                                Navigator.DefaultImpls.showFragment$default(navigator3, context4, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.OptionPositionId(uuid, CollectionsKt.listOf(uuid), ((MarginMaintenanceTableFragmentKey) MarginMaintenanceTableFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountNumber(), null, 8, null)), false, false, false, null, false, null, false, false, null, null, 4084, null);
                                return true;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (i3 == 3) {
                            Navigator navigator4 = this.this$0.getNavigator();
                            Context context5 = context;
                            if (symbol != null) {
                                indexDetailPageFragmentKey = new IndexDetailPageFragmentKey(symbol, ((MarginMaintenanceTableFragmentKey) MarginMaintenanceTableFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountNumber(), IndexDetailPageFragmentKey2.MarginMaintenanceTable.INSTANCE);
                            } else {
                                MarginMaintenanceTableFragment marginMaintenanceTableFragment3 = this.this$0;
                                if (uuid != null) {
                                    indexDetailPageFragmentKey = new IndexDetailPageFragmentKey(uuid, ((MarginMaintenanceTableFragmentKey) MarginMaintenanceTableFragment.INSTANCE.getArgs((Fragment) marginMaintenanceTableFragment3)).getAccountNumber(), IndexDetailPageFragmentKey2.MarginMaintenanceTable.INSTANCE);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            Navigator.DefaultImpls.showFragment$default(navigator4, context5, indexDetailPageFragmentKey, false, false, false, null, false, null, false, false, null, null, 4084, null);
                            return true;
                        }
                        if (i3 == 4) {
                            Navigator navigator5 = this.this$0.getNavigator();
                            Context context6 = context;
                            if (uuid != null) {
                                Navigator.DefaultImpls.showFragment$default(navigator5, context6, new FuturesDetailFragmentKey.ByContractId(uuid, new Screen(Screen.Name.MARGIN_MAINTENANCE_TABLE, null, null, null, 14, null), MarginMaintenanceTableFragment5.MAINTENANCE_TABLE_ENTRY_POINT), false, false, false, null, false, null, false, false, null, null, 4092, null);
                                return true;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (i3 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Navigator navigator6 = this.this$0.getNavigator();
                        Context context7 = context;
                        if (uuid != null) {
                            Navigator.DefaultImpls.showFragment$default(navigator6, context7, new EventDetailRoutingFragmentKey(uuid, EcUuidType.CONTRACT_ID, MarginMaintenanceTableFragment5.MAINTENANCE_TABLE_ENTRY_POINT, false, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                            return true;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            SduiActionHandler3.ProvideActionHandler(sduiActionHandler, ComposableLambda3.rememberComposableLambda(-389537519, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-389537519, i3, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.<anonymous> (MarginMaintenanceTableFragment.kt:222)");
                    }
                    final MarginMaintenanceTableFragment marginMaintenanceTableFragment = MarginMaintenanceTableFragment.this;
                    final SnapshotState<Boolean> snapshotState2 = snapshotState;
                    final Context context2 = context;
                    final SduiActionHandler<bonfire.proto.idl.margin.p036v1.MaintenanceTableAction> sduiActionHandler2 = sduiActionHandler;
                    final SnapshotState4<MarginMaintenanceTableState4> snapshotState4 = snapshotState4CollectAsState;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1000252508, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1000252508, i4, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.<anonymous>.<anonymous> (MarginMaintenanceTableFragment.kt:223)");
                            }
                            ProvidedValue<EventLogger> providedValueProvides = AutoLoggingCompositionLocals.getLocalEventLogger().provides(marginMaintenanceTableFragment.getEventLogger());
                            final SnapshotState<Boolean> snapshotState3 = snapshotState2;
                            final MarginMaintenanceTableFragment marginMaintenanceTableFragment2 = marginMaintenanceTableFragment;
                            final Context context3 = context2;
                            final SduiActionHandler<bonfire.proto.idl.margin.p036v1.MaintenanceTableAction> sduiActionHandler3 = sduiActionHandler2;
                            final SnapshotState4<MarginMaintenanceTableState4> snapshotState42 = snapshotState4;
                            CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1736030492, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.1.1.1

                                /* compiled from: MarginMaintenanceTableFragment.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                    final /* synthetic */ SduiActionHandler<bonfire.proto.idl.margin.p036v1.MaintenanceTableAction> $actionHandler;
                                    final /* synthetic */ Context $context;
                                    final /* synthetic */ SnapshotState<Boolean> $showAppBarTitle$delegate;
                                    final /* synthetic */ SnapshotState4<MarginMaintenanceTableState4> $viewState$delegate;
                                    final /* synthetic */ MarginMaintenanceTableFragment this$0;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass2(MarginMaintenanceTableFragment marginMaintenanceTableFragment, SduiActionHandler<? super bonfire.proto.idl.margin.p036v1.MaintenanceTableAction> sduiActionHandler, Context context, SnapshotState4<? extends MarginMaintenanceTableState4> snapshotState4, SnapshotState<Boolean> snapshotState) {
                                        this.this$0 = marginMaintenanceTableFragment;
                                        this.$actionHandler = sduiActionHandler;
                                        this.$context = context;
                                        this.$viewState$delegate = snapshotState4;
                                        this.$showAppBarTitle$delegate = snapshotState;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                        int i2;
                                        MarginHealthState marginHealthState;
                                        Composer composer2 = composer;
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i & 6) == 0) {
                                            i2 = i | (composer2.changed(paddingValues) ? 4 : 2);
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1949949291, i2, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarginMaintenanceTableFragment.kt:257)");
                                        }
                                        AlertDto alert = this.this$0.getAlert();
                                        composer2.startReplaceGroup(1295529667);
                                        if (alert != null) {
                                            SduiActionHandler<bonfire.proto.idl.margin.p036v1.MaintenanceTableAction> sduiActionHandler = this.$actionHandler;
                                            final MarginMaintenanceTableFragment marginMaintenanceTableFragment = this.this$0;
                                            SduiAlert sduiAlert = SduiAlert.INSTANCE;
                                            composer2.startReplaceGroup(1849434622);
                                            Object objRememberedValue = composer2.rememberedValue();
                                            Composer.Companion companion = Composer.INSTANCE;
                                            if (objRememberedValue == companion.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return MarginMaintenanceTableFragment.C168931.AnonymousClass1.C500861.AnonymousClass2.invoke$lambda$4$lambda$1$lambda$0((ActionDto) obj);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue);
                                            }
                                            Function1 function1 = (Function1) objRememberedValue;
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(5004770);
                                            boolean zChangedInstance = composer2.changedInstance(marginMaintenanceTableFragment);
                                            Object objRememberedValue2 = composer2.rememberedValue();
                                            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return MarginMaintenanceTableFragment.C168931.AnonymousClass1.C500861.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(marginMaintenanceTableFragment);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer2.endReplaceGroup();
                                            sduiAlert.Dialog(alert, function1, sduiActionHandler, (Function1<? super String, Unit>) null, (Function0<Unit>) objRememberedValue2, composer, (SduiAlert.$stable << 15) | 48, 8);
                                            composer2 = composer;
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        composer2.endReplaceGroup();
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                        final MarginMaintenanceTableFragment marginMaintenanceTableFragment2 = this.this$0;
                                        final SduiActionHandler<bonfire.proto.idl.margin.p036v1.MaintenanceTableAction> sduiActionHandler2 = this.$actionHandler;
                                        final Context context = this.$context;
                                        SnapshotState4<MarginMaintenanceTableState4> snapshotState4 = this.$viewState$delegate;
                                        final SnapshotState<Boolean> snapshotState = this.$showAppBarTitle$delegate;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        MarginMaintenanceTableState4 marginMaintenanceTableState4ComposeContent$lambda$0 = MarginMaintenanceTableFragment.ComposeContent$lambda$0(snapshotState4);
                                        if (marginMaintenanceTableState4ComposeContent$lambda$0 instanceof MarginMaintenanceTableState4.Loading) {
                                            composer2.startReplaceGroup(1631149385);
                                            LoadingScreenComposablesKt.ShimmerLoadingComposable(new ShimmerLoaderType.List(false, false, 0, 4, null), null, composer2, ShimmerLoaderType.List.$stable, 2);
                                            composer2.endReplaceGroup();
                                        } else if (marginMaintenanceTableState4ComposeContent$lambda$0 instanceof MarginMaintenanceTableState4.Failure) {
                                            composer2.startReplaceGroup(1631608030);
                                            composer2.startReplaceGroup(5004770);
                                            boolean zChangedInstance2 = composer2.changedInstance(marginMaintenanceTableFragment2);
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$2$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return MarginMaintenanceTableFragment.C168931.AnonymousClass1.C500861.AnonymousClass2.invoke$lambda$15$lambda$6$lambda$5(marginMaintenanceTableFragment2);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer2.endReplaceGroup();
                                            ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue3, 0, null, null, null, null, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                            composer2 = composer;
                                            composer2.endReplaceGroup();
                                        } else {
                                            if (!(marginMaintenanceTableState4ComposeContent$lambda$0 instanceof MarginMaintenanceTableState4.Success)) {
                                                composer2.startReplaceGroup(-1055759725);
                                                composer2.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer2.startReplaceGroup(1632004737);
                                            MarginMaintenanceTableState4 marginMaintenanceTableState4ComposeContent$lambda$02 = MarginMaintenanceTableFragment.ComposeContent$lambda$0(snapshotState4);
                                            Intrinsics.checkNotNull(marginMaintenanceTableState4ComposeContent$lambda$02, "null cannot be cast to non-null type com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableViewState.Success");
                                            MarginMaintenanceTableState4.Success success = (MarginMaintenanceTableState4.Success) marginMaintenanceTableState4ComposeContent$lambda$02;
                                            MarginHealthStateDto marginHealthState2 = success.getMarginHealthState();
                                            if (marginHealthState2 == null || (marginHealthState = (MarginHealthState) marginHealthState2.toProto()) == null) {
                                                marginHealthState = MarginHealthState.HEALTHY;
                                            }
                                            MarginHealthState marginHealthState3 = marginHealthState;
                                            Companion companion3 = MarginMaintenanceTableFragment.INSTANCE;
                                            Screen screen = new Screen(Intrinsics.areEqual(((MarginMaintenanceTableFragmentKey) companion3.getArgs((Fragment) marginMaintenanceTableFragment2)).getEntryPoint(), MarginMaintenanceTableFragment5.MARGIN_CALL_ENTRY_POINT) ? Screen.Name.MARGIN_MAINTENANCE_TABLE_ON_MARGIN_CALL : Screen.Name.MARGIN_MAINTENANCE_TABLE, null, null, null, 14, null);
                                            String entryPoint = ((MarginMaintenanceTableFragmentKey) companion3.getArgs((Fragment) marginMaintenanceTableFragment2)).getEntryPoint();
                                            if (entryPoint == null) {
                                                entryPoint = "";
                                            }
                                            final UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, entryPoint, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, marginHealthState3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -2, -1, 16383, null), null, null, 53, null);
                                            composer2.startReplaceGroup(-1224400529);
                                            boolean zChangedInstance3 = composer2.changedInstance(marginMaintenanceTableFragment2) | composer2.changedInstance(sduiActionHandler2) | composer2.changedInstance(userInteractionEventDescriptor) | composer2.changedInstance(context);
                                            Object objRememberedValue4 = composer2.rememberedValue();
                                            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$2$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return MarginMaintenanceTableFragment.C168931.AnonymousClass1.C500861.AnonymousClass2.invoke$lambda$15$lambda$9$lambda$8(marginMaintenanceTableFragment2, userInteractionEventDescriptor, context, sduiActionHandler2, (GenericRow) obj);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue4);
                                            }
                                            Function1 function12 = (Function1) objRememberedValue4;
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(5004770);
                                            boolean zChangedInstance4 = composer2.changedInstance(sduiActionHandler2);
                                            Object objRememberedValue5 = composer2.rememberedValue();
                                            if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$2$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return MarginMaintenanceTableFragment.C168931.AnonymousClass1.C500861.AnonymousClass2.invoke$lambda$15$lambda$12$lambda$11(sduiActionHandler2, (GenericChildRow) obj);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue5);
                                            }
                                            Function1 function13 = (Function1) objRememberedValue5;
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(5004770);
                                            Object objRememberedValue6 = composer2.rememberedValue();
                                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$2$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return MarginMaintenanceTableFragment.C168931.AnonymousClass1.C500861.AnonymousClass2.invoke$lambda$15$lambda$14$lambda$13(snapshotState, ((Boolean) obj).booleanValue());
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue6);
                                            }
                                            composer2.endReplaceGroup();
                                            MarginMaintenanceTableComposable3.MarginMaintenanceTableComposable(success, userInteractionEventDescriptor, function12, function13, (Function1) objRememberedValue6, null, composer2, 24576, 32);
                                            composer2.endReplaceGroup();
                                        }
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                        invoke(paddingValues, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final bonfire.proto.idl.margin.p036v1.MaintenanceTableAction invoke$lambda$4$lambda$1$lambda$0(ActionDto actionDto) {
                                        AnyMessage concrete;
                                        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
                                            return null;
                                        }
                                        return (bonfire.proto.idl.margin.p036v1.MaintenanceTableAction) concrete.unpack(MaintenanceTableActionDto.INSTANCE.getProtoAdapter());
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$4$lambda$3$lambda$2(MarginMaintenanceTableFragment marginMaintenanceTableFragment) {
                                        marginMaintenanceTableFragment.setAlert(null);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$15$lambda$6$lambda$5(MarginMaintenanceTableFragment marginMaintenanceTableFragment) {
                                        marginMaintenanceTableFragment.getDuxo().init();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$15$lambda$9$lambda$8(MarginMaintenanceTableFragment marginMaintenanceTableFragment, UserInteractionEventDescriptor userInteractionEventDescriptor, Context context, SduiActionHandler sduiActionHandler, GenericRow row) {
                                        bonfire.proto.idl.margin.p036v1.MaintenanceTableAction action;
                                        Intrinsics.checkNotNullParameter(row, "row");
                                        if (!row.getChildRows().isEmpty()) {
                                            marginMaintenanceTableFragment.getDuxo().toggleIsExpanded(row.getKey());
                                        } else if (row.getOnClickAction() != null) {
                                            GenericTableAction onClickAction = row.getOnClickAction();
                                            MaintenanceTableAction maintenanceTableAction = onClickAction instanceof MaintenanceTableAction ? (MaintenanceTableAction) onClickAction : null;
                                            if (maintenanceTableAction != null && (action = maintenanceTableAction.getAction()) != null) {
                                                sduiActionHandler.mo15941handle(action);
                                            }
                                        } else {
                                            UUID uuidFromString = UUID.fromString(row.getKey());
                                            EventLogger.DefaultImpls.logTap$default(marginMaintenanceTableFragment.getEventLogger(), null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.ROW, null, null, 6, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
                                            Navigator navigator = marginMaintenanceTableFragment.getNavigator();
                                            Intrinsics.checkNotNull(uuidFromString);
                                            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(uuidFromString, null, ((MarginMaintenanceTableFragmentKey) MarginMaintenanceTableFragment.INSTANCE.getArgs((Fragment) marginMaintenanceTableFragment)).getAccountNumber(), InstrumentDetailSource.NONE, false, 18, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
                                        }
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$15$lambda$12$lambda$11(SduiActionHandler sduiActionHandler, GenericChildRow childRow) {
                                        bonfire.proto.idl.margin.p036v1.MaintenanceTableAction action;
                                        Intrinsics.checkNotNullParameter(childRow, "childRow");
                                        GenericTableAction onClickAction = childRow.getOnClickAction();
                                        MaintenanceTableAction maintenanceTableAction = onClickAction instanceof MaintenanceTableAction ? (MaintenanceTableAction) onClickAction : null;
                                        if (maintenanceTableAction != null && (action = maintenanceTableAction.getAction()) != null) {
                                            sduiActionHandler.mo15941handle(action);
                                        }
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$15$lambda$14$lambda$13(SnapshotState snapshotState, boolean z) {
                                        MarginMaintenanceTableFragment.ComposeContent$lambda$4(snapshotState, z);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1736030492, i5, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MarginMaintenanceTableFragment.kt:226)");
                                    }
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    final SnapshotState<Boolean> snapshotState5 = snapshotState3;
                                    final MarginMaintenanceTableFragment marginMaintenanceTableFragment3 = marginMaintenanceTableFragment2;
                                    final Context context4 = context3;
                                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(1468664544, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i6) {
                                            if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1468664544, i6, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarginMaintenanceTableFragment.kt:229)");
                                            }
                                            final SnapshotState<Boolean> snapshotState6 = snapshotState5;
                                            final MarginMaintenanceTableFragment marginMaintenanceTableFragment4 = marginMaintenanceTableFragment3;
                                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-609134963, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.1.1.1.1.1
                                                public final void invoke(Composer composer6, int i7) {
                                                    if ((i7 & 3) == 2 && composer6.getSkipping()) {
                                                        composer6.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-609134963, i7, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarginMaintenanceTableFragment.kt:231)");
                                                    }
                                                    if (MarginMaintenanceTableFragment.ComposeContent$lambda$3(snapshotState6)) {
                                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                        MarginMaintenanceTableFragment marginMaintenanceTableFragment5 = marginMaintenanceTableFragment4;
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer6, 6);
                                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierFillMaxWidth$default);
                                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                        if (composer6.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer6.startReusableNode();
                                                        if (composer6.getInserting()) {
                                                            composer6.createNode(constructor);
                                                        } else {
                                                            composer6.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                                        Row6 row6 = Row6.INSTANCE;
                                                        String string2 = marginMaintenanceTableFragment5.getString(C16894R.string.app_bar_title);
                                                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                                        BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer6, 0, 0, 16382);
                                                        composer6.endNode();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                    invoke(composer6, num.intValue());
                                                    return Unit.INSTANCE;
                                                }
                                            }, composer5, 54), null, ComposableLambda3.rememberComposableLambda(742579425, true, new AnonymousClass2(marginMaintenanceTableFragment3), composer5, 54), ComposableLambda3.rememberComposableLambda(712771330, true, new AnonymousClass3(marginMaintenanceTableFragment3, context4), composer5, 54), null, false, false, null, null, 0L, null, composer5, 3462, 0, 2034);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* compiled from: MarginMaintenanceTableFragment.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$1$2, reason: invalid class name */
                                        static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                                            final /* synthetic */ MarginMaintenanceTableFragment this$0;

                                            AnonymousClass2(MarginMaintenanceTableFragment marginMaintenanceTableFragment) {
                                                this.this$0 = marginMaintenanceTableFragment;
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                                invoke(bentoAppBarScope, composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$1$lambda$0(MarginMaintenanceTableFragment marginMaintenanceTableFragment) {
                                                marginMaintenanceTableFragment.requireBaseActivity().onBackPressed();
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
                                                    ComposerKt.traceEventStart(742579425, i, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarginMaintenanceTableFragment.kt:241)");
                                                }
                                                composer.startReplaceGroup(5004770);
                                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                                final MarginMaintenanceTableFragment marginMaintenanceTableFragment = this.this$0;
                                                Object objRememberedValue = composer.rememberedValue();
                                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$1$2$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return MarginMaintenanceTableFragment.C168931.AnonymousClass1.C500861.C500871.AnonymousClass2.invoke$lambda$1$lambda$0(marginMaintenanceTableFragment);
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
                                        }

                                        /* compiled from: MarginMaintenanceTableFragment.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$1$3, reason: invalid class name */
                                        static final class AnonymousClass3 implements Function3<Row5, Composer, Integer, Unit> {
                                            final /* synthetic */ Context $context;
                                            final /* synthetic */ MarginMaintenanceTableFragment this$0;

                                            AnonymousClass3(MarginMaintenanceTableFragment marginMaintenanceTableFragment, Context context) {
                                                this.this$0 = marginMaintenanceTableFragment;
                                                this.$context = context;
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                                invoke(row5, composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                if ((i & 17) == 16 && composer.getSkipping()) {
                                                    composer.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(712771330, i, -1, "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarginMaintenanceTableFragment.kt:244)");
                                                }
                                                composer.startReplaceGroup(-1633490746);
                                                boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$context);
                                                final MarginMaintenanceTableFragment marginMaintenanceTableFragment = this.this$0;
                                                final Context context = this.$context;
                                                Object objRememberedValue = composer.rememberedValue();
                                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$ComposeContent$1$1$1$1$3$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return MarginMaintenanceTableFragment.C168931.AnonymousClass1.C500861.C500871.AnonymousClass3.invoke$lambda$1$lambda$0(marginMaintenanceTableFragment, context);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                IconButton5.IconButton((Function0) objRememberedValue, null, false, null, null, MarginMaintenanceTableFragment2.INSTANCE.m2019x5ea4f5e6(), composer, 196608, 30);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$1$lambda$0(MarginMaintenanceTableFragment marginMaintenanceTableFragment, Context context) {
                                                Navigator.DefaultImpls.handleDeepLink$default(marginMaintenanceTableFragment.getNavigator(), context, Uri.parse(MarginMaintenanceTableFragment5.INFO_SHEET_DEEPLINK), null, null, false, null, 60, null);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }, composer4, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1949949291, true, new AnonymousClass2(marginMaintenanceTableFragment2, sduiActionHandler3, context3, snapshotState42, snapshotState3), composer4, 54), composer4, 805306422, 508);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginMaintenanceTableFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginMaintenanceTableState4 ComposeContent$lambda$0(SnapshotState4<? extends MarginMaintenanceTableState4> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: MarginMaintenanceTableFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/feature/margin/maintenance/table/MarginMaintenanceTableFragment;", "Lcom/robinhood/android/margin/contracts/MarginMaintenanceTableFragmentKey;", "<init>", "()V", "feature-margin-maintenance-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MarginMaintenanceTableFragment, MarginMaintenanceTableFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MarginMaintenanceTableFragmentKey marginMaintenanceTableFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, marginMaintenanceTableFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MarginMaintenanceTableFragmentKey getArgs(MarginMaintenanceTableFragment marginMaintenanceTableFragment) {
            return (MarginMaintenanceTableFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, marginMaintenanceTableFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginMaintenanceTableFragment newInstance(MarginMaintenanceTableFragmentKey marginMaintenanceTableFragmentKey) {
            return (MarginMaintenanceTableFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, marginMaintenanceTableFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginMaintenanceTableFragment marginMaintenanceTableFragment, MarginMaintenanceTableFragmentKey marginMaintenanceTableFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, marginMaintenanceTableFragment, marginMaintenanceTableFragmentKey);
        }
    }
}
