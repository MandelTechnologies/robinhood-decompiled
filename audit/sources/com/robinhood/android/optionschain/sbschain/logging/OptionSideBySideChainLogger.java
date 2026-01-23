package com.robinhood.android.optionschain.sbschain.logging;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2;
import com.robinhood.android.optionschain.sbschain.table.SpreadSelectionState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundleWithRowIndex;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionSideBySideChainLogger.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015J\u001a\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\rJ\u0006\u0010$\u001a\u00020\u0015J\u000e\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*J\u000e\u0010,\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R3\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "legContextAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "", "Lcom/robinhood/android/optionschain/sbschain/logging/SbsChainLegsContext;", "getLegContextAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "legContextAdapter$delegate", "Lkotlin/Lazy;", "logTapLegCell", "", "optionLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "logHorizontalScrollStart", "logTapCallPutSwitcher", "newState", "Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "logTapClearMultilegSelection", "logTapSettings", "logDragEnd", "initialDragTargetForLogging", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "dragTarget", "logNuxBottomSheetPositiveAction", "chainIdsForLogging", "logSwitchBackToClassicChainTooltipAppear", "logSpreadTooltipAppear", "spreadSelectionState", "Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "logBeginLoading", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "logCompleteLoading", "logAbortLoading", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainLogger {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    /* renamed from: legContextAdapter$delegate, reason: from kotlin metadata */
    private final Lazy legContextAdapter;
    private final LazyMoshi moshi;
    private final PerformanceLogger performanceLogger;

    public OptionSideBySideChainLogger(LazyMoshi moshi, EventLogger eventLogger, PerformanceLogger performanceLogger) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        this.moshi = moshi;
        this.eventLogger = eventLogger;
        this.performanceLogger = performanceLogger;
        this.legContextAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.logging.OptionSideBySideChainLogger$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionSideBySideChainLogger.legContextAdapter_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final JsonAdapter<Map<String, List<SbsChainLegsContext>>> getLegContextAdapter() {
        return (JsonAdapter) this.legContextAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter legContextAdapter_delegate$lambda$0(OptionSideBySideChainLogger optionSideBySideChainLogger) {
        LazyMoshi lazyMoshi = optionSideBySideChainLogger.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<Map<String, ? extends List<? extends SbsChainLegsContext>>>() { // from class: com.robinhood.android.optionschain.sbschain.logging.OptionSideBySideChainLogger$legContextAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }

    public final void logTapLegCell(OptionLegBundle optionLegBundle) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        EventLogger eventLogger = this.eventLogger;
        Screen screen = new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.OPTION_INSTRUMENT_PILL;
        String string2 = optionLegBundle.getOptionInstrument().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Component component = new Component(componentType, string2, null, 4, null);
        String string3 = optionLegBundle.getOptionInstrument().getOptionChainId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, new Context(i, i2, i3, null, null, null, null, null, i4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(string3, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), false, 41, null);
    }

    public final void logHorizontalScrollStart() {
        EventLogger.DefaultImpls.logScroll$default(this.eventLogger, UserInteractionEventData.Action.SCROLL_HORIZONTALLY, new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null), null, null, null, 28, null);
    }

    public final void logTapCallPutSwitcher(OptionSideBySideChainDataState2 newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, newState.getLoggingIdentifier(), null, 4, null), null, null, false, 57, null);
    }

    public final void logTapClearMultilegSelection() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "CLEAR", null, 4, null), null, null, false, 57, null);
    }

    public final void logTapSettings() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "SETTINGS", null, 4, null), null, null, false, 57, null);
    }

    public final void logDragEnd(DragTarget initialDragTargetForLogging, DragTarget dragTarget) {
        String string2;
        OptionLegBundle legBundle;
        OptionInstrument optionInstrument;
        if (initialDragTargetForLogging == null || dragTarget == null) {
            return;
        }
        OptionLegBundleWithRowIndex optionLegBundleWithRowIndex = (OptionLegBundleWithRowIndex) CollectionsKt.firstOrNull((List) dragTarget.getLegBundlesWithRowIndex());
        UUID optionChainId = (optionLegBundleWithRowIndex == null || (legBundle = optionLegBundleWithRowIndex.getLegBundle()) == null || (optionInstrument = legBundle.getOptionInstrument()) == null) ? null : optionInstrument.getOptionChainId();
        ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex = initialDragTargetForLogging.getLegBundlesWithRowIndex();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundlesWithRowIndex, 10));
        Iterator<OptionLegBundleWithRowIndex> it = legBundlesWithRowIndex.iterator();
        while (it.hasNext()) {
            arrayList.add(SbsChainLegsContext.INSTANCE.toLoggingContext(it.next().getLegBundle()));
        }
        ImmutableList<OptionLegBundleWithRowIndex> legBundlesWithRowIndex2 = dragTarget.getLegBundlesWithRowIndex();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundlesWithRowIndex2, 10));
        Iterator<OptionLegBundleWithRowIndex> it2 = legBundlesWithRowIndex2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(SbsChainLegsContext.INSTANCE.toLoggingContext(it2.next().getLegBundle()));
        }
        EventLogger eventLogger = this.eventLogger;
        Screen screen = new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null);
        if (optionChainId == null || (string2 = optionChainId.toString()) == null) {
            string2 = "";
        }
        String str = string2;
        String json = getLegContextAdapter().toJson(MapsKt.mapOf(Tuples4.m3642to("before_legs", arrayList), Tuples4.m3642to("after_legs", arrayList2)));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        EventLogger.DefaultImpls.logDrag$default(eventLogger, null, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(str, null, null, null, null, null, null, null, null, null, null, null, json, null, 12286, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), false, 45, null);
    }

    public final void logNuxBottomSheetPositiveAction(String chainIdsForLogging) {
        Intrinsics.checkNotNullParameter(chainIdsForLogging, "chainIdsForLogging");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "sbs_nux_popup", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(chainIdsForLogging, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), false, 41, null);
    }

    public final void logSwitchBackToClassicChainTooltipAppear() {
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null), new Component(Component.ComponentType.TOOLTIP, "sbs_idle_tooltip", null, 4, null), null, null, 25, null);
    }

    public final void logSpreadTooltipAppear(SpreadSelectionState spreadSelectionState) {
        UUID optionChainId;
        OptionLegBundle legBundle;
        OptionInstrument optionInstrument;
        Tuples2 tuples2M3642to;
        OptionLegBundle legBundle2;
        OptionInstrument optionInstrument2;
        OptionLegBundle legBundle3;
        OptionInstrument optionInstrument3;
        String string2;
        String string3;
        String string4;
        OptionLegBundle legBundle4;
        OptionInstrument optionInstrument4;
        OptionLegBundle legBundle5;
        OptionInstrument optionInstrument5;
        OptionLegBundle legBundle6;
        OptionInstrument optionInstrument6;
        Intrinsics.checkNotNullParameter(spreadSelectionState, "spreadSelectionState");
        ImmutableList<OptionLegBundleWithRowIndex> legsWithRowIndex = spreadSelectionState.getLegsWithRowIndex(OptionContractType.CALL);
        ImmutableList<OptionLegBundleWithRowIndex> legsWithRowIndex2 = spreadSelectionState.getLegsWithRowIndex(OptionContractType.PUT);
        OptionLegBundleWithRowIndex optionLegBundleWithRowIndex = (OptionLegBundleWithRowIndex) CollectionsKt.firstOrNull((List) legsWithRowIndex);
        if (optionLegBundleWithRowIndex == null || (legBundle6 = optionLegBundleWithRowIndex.getLegBundle()) == null || (optionInstrument6 = legBundle6.getOptionInstrument()) == null || (optionChainId = optionInstrument6.getOptionChainId()) == null) {
            OptionLegBundleWithRowIndex optionLegBundleWithRowIndex2 = (OptionLegBundleWithRowIndex) CollectionsKt.firstOrNull((List) legsWithRowIndex2);
            optionChainId = (optionLegBundleWithRowIndex2 == null || (legBundle = optionLegBundleWithRowIndex2.getLegBundle()) == null || (optionInstrument = legBundle.getOptionInstrument()) == null) ? null : optionInstrument.getOptionChainId();
        }
        if (!legsWithRowIndex.isEmpty()) {
            OptionLegBundleWithRowIndex optionLegBundleWithRowIndex3 = (OptionLegBundleWithRowIndex) CollectionsKt.getOrNull(legsWithRowIndex, 0);
            UUID id = (optionLegBundleWithRowIndex3 == null || (legBundle5 = optionLegBundleWithRowIndex3.getLegBundle()) == null || (optionInstrument5 = legBundle5.getOptionInstrument()) == null) ? null : optionInstrument5.getId();
            OptionLegBundleWithRowIndex optionLegBundleWithRowIndex4 = (OptionLegBundleWithRowIndex) CollectionsKt.getOrNull(legsWithRowIndex, 1);
            tuples2M3642to = Tuples4.m3642to(id, (optionLegBundleWithRowIndex4 == null || (legBundle4 = optionLegBundleWithRowIndex4.getLegBundle()) == null || (optionInstrument4 = legBundle4.getOptionInstrument()) == null) ? null : optionInstrument4.getId());
        } else if (!legsWithRowIndex2.isEmpty()) {
            OptionLegBundleWithRowIndex optionLegBundleWithRowIndex5 = (OptionLegBundleWithRowIndex) CollectionsKt.getOrNull(legsWithRowIndex2, 0);
            UUID id2 = (optionLegBundleWithRowIndex5 == null || (legBundle3 = optionLegBundleWithRowIndex5.getLegBundle()) == null || (optionInstrument3 = legBundle3.getOptionInstrument()) == null) ? null : optionInstrument3.getId();
            OptionLegBundleWithRowIndex optionLegBundleWithRowIndex6 = (OptionLegBundleWithRowIndex) CollectionsKt.getOrNull(legsWithRowIndex2, 1);
            tuples2M3642to = Tuples4.m3642to(id2, (optionLegBundleWithRowIndex6 == null || (legBundle2 = optionLegBundleWithRowIndex6.getLegBundle()) == null || (optionInstrument2 = legBundle2.getOptionInstrument()) == null) ? null : optionInstrument2.getId());
        } else {
            tuples2M3642to = Tuples4.m3642to(null, null);
        }
        UUID uuid = (UUID) tuples2M3642to.component1();
        UUID uuid2 = (UUID) tuples2M3642to.component2();
        EventLogger eventLogger = this.eventLogger;
        Screen screen = new Screen(Screen.Name.SIDE_BY_SIDE_OPTION_CHAIN, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.TOOLTIP, "spread_selection_tooltip", null, 4, null);
        String str = "";
        String str2 = (optionChainId == null || (string4 = optionChainId.toString()) == null) ? "" : string4;
        if (uuid == null || (string2 = uuid.toString()) == null) {
            string2 = "";
        }
        OptionsContext.OptionLeg optionLeg = new OptionsContext.OptionLeg(string2, null, 2, null);
        if (uuid2 != null && (string3 = uuid2.toString()) != null) {
            str = string3;
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(str2, null, null, null, null, optionLeg, new OptionsContext.OptionLeg(str, null, 2, null), null, null, null, null, null, null, null, 16286, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), 9, null);
    }

    public final void logBeginLoading(UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        PerformanceLogger performanceLogger = this.performanceLogger;
        PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.OPTIONS_SIDE_BY_SIDE_CHAIN;
        UUID id = uiOptionChain.getOptionChain().getId();
        String string2 = uiOptionChain.getOptionChain().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, name, null, id, new PerformanceMetricEventData.Context(false, false, false, new PerformanceMetricEventData.Context.Options(null, null, false, string2, uiOptionChain.getOptionChain().getSymbol(), null, null, 103, null), null, null, null, null, null, null, null, null, 4087, null), 2, null);
    }

    public final void logCompleteLoading(UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        this.performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_SIDE_BY_SIDE_CHAIN, uiOptionChain.getOptionChain().getId());
    }

    public final void logAbortLoading(UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        this.performanceLogger.abortMetric(PerformanceMetricEventData.Name.OPTIONS_SIDE_BY_SIDE_CHAIN, uiOptionChain.getOptionChain().getId());
    }
}
