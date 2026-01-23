package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageOptionRow.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00012Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u0011\u0010*\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ju\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionRow;", "", "titleStart", "", "subtitleStart", "titleEnd", "subtitleEnd", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "showFragmentInStandaloneActivity", "", "optionRowType", "Lcom/robinhood/android/options/ui/detail/OptionRow$OptionRowType;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/navigation/keys/FragmentKey;ZLcom/robinhood/android/options/ui/detail/OptionRow$OptionRowType;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getTitleStart", "()Ljava/lang/String;", "getSubtitleStart", "getTitleEnd", "getSubtitleEnd", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getShowFragmentInStandaloneActivity", "()Z", "getOptionRowType", "()Lcom/robinhood/android/options/ui/detail/OptionRow$OptionRowType;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "OptionRowType", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionRow {
    public static final int $stable = 8;
    private final Context eventContext;
    private final Screen eventScreen;
    private final FragmentKey key;
    private final OptionRowType optionRowType;
    private final boolean showFragmentInStandaloneActivity;
    private final String subtitleEnd;
    private final String subtitleStart;
    private final String titleEnd;
    private final String titleStart;

    public static /* synthetic */ OptionRow copy$default(OptionRow optionRow, String str, String str2, String str3, String str4, FragmentKey fragmentKey, boolean z, OptionRowType optionRowType, Context context, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionRow.titleStart;
        }
        if ((i & 2) != 0) {
            str2 = optionRow.subtitleStart;
        }
        if ((i & 4) != 0) {
            str3 = optionRow.titleEnd;
        }
        if ((i & 8) != 0) {
            str4 = optionRow.subtitleEnd;
        }
        if ((i & 16) != 0) {
            fragmentKey = optionRow.key;
        }
        if ((i & 32) != 0) {
            z = optionRow.showFragmentInStandaloneActivity;
        }
        if ((i & 64) != 0) {
            optionRowType = optionRow.optionRowType;
        }
        if ((i & 128) != 0) {
            context = optionRow.eventContext;
        }
        if ((i & 256) != 0) {
            screen = optionRow.eventScreen;
        }
        Context context2 = context;
        Screen screen2 = screen;
        boolean z2 = z;
        OptionRowType optionRowType2 = optionRowType;
        FragmentKey fragmentKey2 = fragmentKey;
        String str5 = str3;
        return optionRow.copy(str, str2, str5, str4, fragmentKey2, z2, optionRowType2, context2, screen2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitleStart() {
        return this.titleStart;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitleStart() {
        return this.subtitleStart;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitleEnd() {
        return this.titleEnd;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitleEnd() {
        return this.subtitleEnd;
    }

    /* renamed from: component5, reason: from getter */
    public final FragmentKey getKey() {
        return this.key;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowFragmentInStandaloneActivity() {
        return this.showFragmentInStandaloneActivity;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionRowType getOptionRowType() {
        return this.optionRowType;
    }

    /* renamed from: component8, reason: from getter */
    public final Context getEventContext() {
        return this.eventContext;
    }

    /* renamed from: component9, reason: from getter */
    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final OptionRow copy(String titleStart, String subtitleStart, String titleEnd, String subtitleEnd, FragmentKey key, boolean showFragmentInStandaloneActivity, OptionRowType optionRowType, Context eventContext, Screen eventScreen) {
        Intrinsics.checkNotNullParameter(titleStart, "titleStart");
        Intrinsics.checkNotNullParameter(optionRowType, "optionRowType");
        return new OptionRow(titleStart, subtitleStart, titleEnd, subtitleEnd, key, showFragmentInStandaloneActivity, optionRowType, eventContext, eventScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionRow)) {
            return false;
        }
        OptionRow optionRow = (OptionRow) other;
        return Intrinsics.areEqual(this.titleStart, optionRow.titleStart) && Intrinsics.areEqual(this.subtitleStart, optionRow.subtitleStart) && Intrinsics.areEqual(this.titleEnd, optionRow.titleEnd) && Intrinsics.areEqual(this.subtitleEnd, optionRow.subtitleEnd) && Intrinsics.areEqual(this.key, optionRow.key) && this.showFragmentInStandaloneActivity == optionRow.showFragmentInStandaloneActivity && this.optionRowType == optionRow.optionRowType && Intrinsics.areEqual(this.eventContext, optionRow.eventContext) && Intrinsics.areEqual(this.eventScreen, optionRow.eventScreen);
    }

    public int hashCode() {
        int iHashCode = this.titleStart.hashCode() * 31;
        String str = this.subtitleStart;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleEnd;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitleEnd;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FragmentKey fragmentKey = this.key;
        int iHashCode5 = (((((iHashCode4 + (fragmentKey == null ? 0 : fragmentKey.hashCode())) * 31) + Boolean.hashCode(this.showFragmentInStandaloneActivity)) * 31) + this.optionRowType.hashCode()) * 31;
        Context context = this.eventContext;
        int iHashCode6 = (iHashCode5 + (context == null ? 0 : context.hashCode())) * 31;
        Screen screen = this.eventScreen;
        return iHashCode6 + (screen != null ? screen.hashCode() : 0);
    }

    public String toString() {
        return "OptionRow(titleStart=" + this.titleStart + ", subtitleStart=" + this.subtitleStart + ", titleEnd=" + this.titleEnd + ", subtitleEnd=" + this.subtitleEnd + ", key=" + this.key + ", showFragmentInStandaloneActivity=" + this.showFragmentInStandaloneActivity + ", optionRowType=" + this.optionRowType + ", eventContext=" + this.eventContext + ", eventScreen=" + this.eventScreen + ")";
    }

    public OptionRow(String titleStart, String str, String str2, String str3, FragmentKey fragmentKey, boolean z, OptionRowType optionRowType, Context context, Screen screen) {
        Intrinsics.checkNotNullParameter(titleStart, "titleStart");
        Intrinsics.checkNotNullParameter(optionRowType, "optionRowType");
        this.titleStart = titleStart;
        this.subtitleStart = str;
        this.titleEnd = str2;
        this.subtitleEnd = str3;
        this.key = fragmentKey;
        this.showFragmentInStandaloneActivity = z;
        this.optionRowType = optionRowType;
        this.eventContext = context;
        this.eventScreen = screen;
    }

    public /* synthetic */ OptionRow(String str, String str2, String str3, String str4, FragmentKey fragmentKey, boolean z, OptionRowType optionRowType, Context context, Screen screen, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : fragmentKey, (i & 32) != 0 ? false : z, optionRowType, (i & 128) != 0 ? null : context, (i & 256) != 0 ? null : screen);
    }

    public final String getTitleStart() {
        return this.titleStart;
    }

    public final String getSubtitleStart() {
        return this.subtitleStart;
    }

    public final String getTitleEnd() {
        return this.titleEnd;
    }

    public final String getSubtitleEnd() {
        return this.subtitleEnd;
    }

    public final FragmentKey getKey() {
        return this.key;
    }

    public final boolean getShowFragmentInStandaloneActivity() {
        return this.showFragmentInStandaloneActivity;
    }

    public final OptionRowType getOptionRowType() {
        return this.optionRowType;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionsDetailPageOptionRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionRow$OptionRowType;", "", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "<init>", "(Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;)V", "getAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "OPTION_LEG", "COMBO_ORDER", "OPTION_ORDER", "OPTION_EVENT", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionRowType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OptionRowType[] $VALUES;
        private final UserInteractionEventData.Action action;
        private final Component.ComponentType componentType;
        public static final OptionRowType OPTION_LEG = new OptionRowType("OPTION_LEG", 0, UserInteractionEventData.Action.VIEW_OPTION_STRATEGY_DETAIL, null, 2, null);
        public static final OptionRowType COMBO_ORDER = new OptionRowType("COMBO_ORDER", 1, UserInteractionEventData.Action.VIEW_COMBO_ORDER_DETAIL, null, 2, null);
        public static final OptionRowType OPTION_ORDER = new OptionRowType("OPTION_ORDER", 2, UserInteractionEventData.Action.VIEW_OPTION_ORDER_DETAIL, null, 2, null);
        public static final OptionRowType OPTION_EVENT = new OptionRowType("OPTION_EVENT", 3, UserInteractionEventData.Action.ACTION_UNSPECIFIED, null, 2, null);

        private static final /* synthetic */ OptionRowType[] $values() {
            return new OptionRowType[]{OPTION_LEG, COMBO_ORDER, OPTION_ORDER, OPTION_EVENT};
        }

        public static EnumEntries<OptionRowType> getEntries() {
            return $ENTRIES;
        }

        private OptionRowType(String str, int i, UserInteractionEventData.Action action, Component.ComponentType componentType) {
            this.action = action;
            this.componentType = componentType;
        }

        public final UserInteractionEventData.Action getAction() {
            return this.action;
        }

        /* synthetic */ OptionRowType(String str, int i, UserInteractionEventData.Action action, Component.ComponentType componentType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, action, (i2 & 2) != 0 ? Component.ComponentType.HISTORY_ROW : componentType);
        }

        public final Component.ComponentType getComponentType() {
            return this.componentType;
        }

        static {
            OptionRowType[] optionRowTypeArr$values = $values();
            $VALUES = optionRowTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(optionRowTypeArr$values);
        }

        public static OptionRowType valueOf(String str) {
            return (OptionRowType) Enum.valueOf(OptionRowType.class, str);
        }

        public static OptionRowType[] values() {
            return (OptionRowType[]) $VALUES.clone();
        }
    }
}
