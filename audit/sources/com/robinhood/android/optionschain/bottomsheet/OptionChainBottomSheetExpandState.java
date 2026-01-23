package com.robinhood.android.optionschain.bottomsheet;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainBottomSheetExpandState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetExpandState;", "", "<init>", "(Ljava/lang/String;I)V", "COLLAPSED", "HALF_EXPANDED", "EXPANDED", "isExpanded", "", "()Z", "isFullyExpanded", "isCollapsed", "getLoggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionChainBottomSheetExpandState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainBottomSheetExpandState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OptionChainBottomSheetExpandState COLLAPSED = new OptionChainBottomSheetExpandState("COLLAPSED", 0);
    public static final OptionChainBottomSheetExpandState HALF_EXPANDED = new OptionChainBottomSheetExpandState("HALF_EXPANDED", 1);
    public static final OptionChainBottomSheetExpandState EXPANDED = new OptionChainBottomSheetExpandState("EXPANDED", 2);

    /* compiled from: OptionChainBottomSheetExpandState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainBottomSheetExpandState.values().length];
            try {
                iArr[OptionChainBottomSheetExpandState.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainBottomSheetExpandState.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionChainBottomSheetExpandState.EXPANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OptionChainBottomSheetExpandState[] $values() {
        return new OptionChainBottomSheetExpandState[]{COLLAPSED, HALF_EXPANDED, EXPANDED};
    }

    public static EnumEntries<OptionChainBottomSheetExpandState> getEntries() {
        return $ENTRIES;
    }

    private OptionChainBottomSheetExpandState(String str, int i) {
    }

    static {
        OptionChainBottomSheetExpandState[] optionChainBottomSheetExpandStateArr$values = $values();
        $VALUES = optionChainBottomSheetExpandStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainBottomSheetExpandStateArr$values);
        INSTANCE = new Companion(null);
    }

    public final boolean isExpanded() {
        return this == EXPANDED || this == HALF_EXPANDED;
    }

    public final boolean isFullyExpanded() {
        return this == EXPANDED;
    }

    public final boolean isCollapsed() {
        return this == COLLAPSED;
    }

    public final UserInteractionEventData.Action getLoggingAction() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return UserInteractionEventData.Action.COLLAPSE;
        }
        if (i == 2) {
            return UserInteractionEventData.Action.HALF_EXPAND;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return UserInteractionEventData.Action.EXPAND;
    }

    /* compiled from: OptionChainBottomSheetExpandState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetExpandState$Companion;", "", "<init>", "()V", "fromMultiModeSheetValueAndIndex", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetExpandState;", "value", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionChainBottomSheetExpandState fromMultiModeSheetValueAndIndex(MultiModeSheetState2 value, int index) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value instanceof MultiModeSheetState2.Hidden) {
                return null;
            }
            if (value instanceof MultiModeSheetState2.FixedHeight) {
                if (index == 0) {
                    return OptionChainBottomSheetExpandState.COLLAPSED;
                }
                if (index == 1) {
                    return OptionChainBottomSheetExpandState.HALF_EXPANDED;
                }
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Throwable("Option chain bottom sheet: Impossible combination " + value + " and " + index), true, null, 4, null);
                return null;
            }
            if (!Intrinsics.areEqual(value, MultiModeSheetState2.Expanded.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            if (index == 1) {
                return OptionChainBottomSheetExpandState.EXPANDED;
            }
            if (index == 2) {
                return OptionChainBottomSheetExpandState.EXPANDED;
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Throwable("Option chain bottom sheet: Impossible combination " + value + " and " + index), true, null, 4, null);
            return null;
        }
    }

    public static OptionChainBottomSheetExpandState valueOf(String str) {
        return (OptionChainBottomSheetExpandState) Enum.valueOf(OptionChainBottomSheetExpandState.class, str);
    }

    public static OptionChainBottomSheetExpandState[] values() {
        return (OptionChainBottomSheetExpandState[]) $VALUES.clone();
    }
}
