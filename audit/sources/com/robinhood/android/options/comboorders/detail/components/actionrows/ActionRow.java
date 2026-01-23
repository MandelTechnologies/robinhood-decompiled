package com.robinhood.android.options.comboorders.detail.components.actionrows;

import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.options.comboorders.detail.components.actionrows.ActionRow;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Comparator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrderDetailActionRowsViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow;", "", "primaryTextString", "", "navigationKey", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "type", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow$ActionRowType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/navigation/keys/NavigationKey;Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow$ActionRowType;)V", "getPrimaryTextString", "()Ljava/lang/String;", "getNavigationKey", "()Lcom/robinhood/android/navigation/keys/NavigationKey;", "getType", "()Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow$ActionRowType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ActionRowType", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActionRow {
    public static final int $stable = 8;
    private final NavigationKey navigationKey;
    private final String primaryTextString;
    private final ActionRowType type;

    public static /* synthetic */ ActionRow copy$default(ActionRow actionRow, String str, NavigationKey navigationKey, ActionRowType actionRowType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionRow.primaryTextString;
        }
        if ((i & 2) != 0) {
            navigationKey = actionRow.navigationKey;
        }
        if ((i & 4) != 0) {
            actionRowType = actionRow.type;
        }
        return actionRow.copy(str, navigationKey, actionRowType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrimaryTextString() {
        return this.primaryTextString;
    }

    /* renamed from: component2, reason: from getter */
    public final NavigationKey getNavigationKey() {
        return this.navigationKey;
    }

    /* renamed from: component3, reason: from getter */
    public final ActionRowType getType() {
        return this.type;
    }

    public final ActionRow copy(String primaryTextString, NavigationKey navigationKey, ActionRowType type2) {
        Intrinsics.checkNotNullParameter(primaryTextString, "primaryTextString");
        Intrinsics.checkNotNullParameter(navigationKey, "navigationKey");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new ActionRow(primaryTextString, navigationKey, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionRow)) {
            return false;
        }
        ActionRow actionRow = (ActionRow) other;
        return Intrinsics.areEqual(this.primaryTextString, actionRow.primaryTextString) && Intrinsics.areEqual(this.navigationKey, actionRow.navigationKey) && this.type == actionRow.type;
    }

    public int hashCode() {
        return (((this.primaryTextString.hashCode() * 31) + this.navigationKey.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "ActionRow(primaryTextString=" + this.primaryTextString + ", navigationKey=" + this.navigationKey + ", type=" + this.type + ")";
    }

    public ActionRow(String primaryTextString, NavigationKey navigationKey, ActionRowType type2) {
        Intrinsics.checkNotNullParameter(primaryTextString, "primaryTextString");
        Intrinsics.checkNotNullParameter(navigationKey, "navigationKey");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.primaryTextString = primaryTextString;
        this.navigationKey = navigationKey;
        this.type = type2;
    }

    public final String getPrimaryTextString() {
        return this.primaryTextString;
    }

    public final NavigationKey getNavigationKey() {
        return this.navigationKey;
    }

    public final ActionRowType getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComboOrderDetailActionRowsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow$ActionRowType;", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "<init>", "(Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;)V", "getAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "VIEW_EQUITY", "VIEW_EQUITY_OPTION", "VIEW_TRADE_CONFIRMATION", "Companion", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ActionRowType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActionRowType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ActionRowType VIEW_EQUITY;
        public static final ActionRowType VIEW_EQUITY_OPTION;
        public static final ActionRowType VIEW_TRADE_CONFIRMATION;
        private static final Comparator<ActionRow> comparator;
        private static final Map<ActionRowType, Integer> orderMap;
        private final UserInteractionEventData.Action action;
        private final Component.ComponentType componentType;

        private static final /* synthetic */ ActionRowType[] $values() {
            return new ActionRowType[]{VIEW_EQUITY, VIEW_EQUITY_OPTION, VIEW_TRADE_CONFIRMATION};
        }

        public static EnumEntries<ActionRowType> getEntries() {
            return $ENTRIES;
        }

        private ActionRowType(String str, int i, UserInteractionEventData.Action action, Component.ComponentType componentType) {
            this.action = action;
            this.componentType = componentType;
        }

        public final UserInteractionEventData.Action getAction() {
            return this.action;
        }

        public final Component.ComponentType getComponentType() {
            return this.componentType;
        }

        static {
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE;
            Component.ComponentType componentType = Component.ComponentType.ROW;
            ActionRowType actionRowType = new ActionRowType("VIEW_EQUITY", 0, action, componentType);
            VIEW_EQUITY = actionRowType;
            ActionRowType actionRowType2 = new ActionRowType("VIEW_EQUITY_OPTION", 1, UserInteractionEventData.Action.VIEW_OPTION_CHAIN, componentType);
            VIEW_EQUITY_OPTION = actionRowType2;
            ActionRowType actionRowType3 = new ActionRowType("VIEW_TRADE_CONFIRMATION", 2, UserInteractionEventData.Action.VIEW_TRADE_CONFIRMATION, Component.ComponentType.BUTTON);
            VIEW_TRADE_CONFIRMATION = actionRowType3;
            ActionRowType[] actionRowTypeArr$values = $values();
            $VALUES = actionRowTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionRowTypeArr$values);
            INSTANCE = new Companion(null);
            orderMap = MapsKt.mapOf(Tuples4.m3642to(actionRowType2, 0), Tuples4.m3642to(actionRowType, 1), Tuples4.m3642to(actionRowType3, 2));
            comparator = new Comparator() { // from class: com.robinhood.android.options.comboorders.detail.components.actionrows.ActionRow$ActionRowType$special$$inlined$compareBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Comparable) ActionRow.ActionRowType.orderMap.get(((ActionRow) t).getType()), (Comparable) ActionRow.ActionRowType.orderMap.get(((ActionRow) t2).getType()));
                }
            };
        }

        /* compiled from: ComboOrderDetailActionRowsViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow$ActionRowType$Companion;", "", "<init>", "()V", "orderMap", "", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow$ActionRowType;", "", "comparator", "Ljava/util/Comparator;", "Lcom/robinhood/android/options/comboorders/detail/components/actionrows/ActionRow;", "Lkotlin/Comparator;", "getComparator", "()Ljava/util/Comparator;", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Comparator<ActionRow> getComparator() {
                return ActionRowType.comparator;
            }
        }

        public static ActionRowType valueOf(String str) {
            return (ActionRowType) Enum.valueOf(ActionRowType.class, str);
        }

        public static ActionRowType[] values() {
            return (ActionRowType[]) $VALUES.clone();
        }
    }
}
