package com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TitleContent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "isTitleLoading", "", "dayDeltaDisplay", "deltaDirection", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState$DeltaDirection;", "isDayDeltaLoading", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState$DeltaDirection;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getDayDeltaDisplay", "getDeltaDirection", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState$DeltaDirection;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "DeltaDirection", "Companion", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TitleContentState {
    private final StringResource dayDeltaDisplay;
    private final DeltaDirection deltaDirection;
    private final boolean isDayDeltaLoading;
    private final boolean isTitleLoading;
    private final StringResource title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = StringResource.$stable;

    public static /* synthetic */ TitleContentState copy$default(TitleContentState titleContentState, StringResource stringResource, boolean z, StringResource stringResource2, DeltaDirection deltaDirection, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = titleContentState.title;
        }
        if ((i & 2) != 0) {
            z = titleContentState.isTitleLoading;
        }
        if ((i & 4) != 0) {
            stringResource2 = titleContentState.dayDeltaDisplay;
        }
        if ((i & 8) != 0) {
            deltaDirection = titleContentState.deltaDirection;
        }
        if ((i & 16) != 0) {
            z2 = titleContentState.isDayDeltaLoading;
        }
        boolean z3 = z2;
        StringResource stringResource3 = stringResource2;
        return titleContentState.copy(stringResource, z, stringResource3, deltaDirection, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTitleLoading() {
        return this.isTitleLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getDayDeltaDisplay() {
        return this.dayDeltaDisplay;
    }

    /* renamed from: component4, reason: from getter */
    public final DeltaDirection getDeltaDirection() {
        return this.deltaDirection;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDayDeltaLoading() {
        return this.isDayDeltaLoading;
    }

    public final TitleContentState copy(StringResource title, boolean isTitleLoading, StringResource dayDeltaDisplay, DeltaDirection deltaDirection, boolean isDayDeltaLoading) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dayDeltaDisplay, "dayDeltaDisplay");
        Intrinsics.checkNotNullParameter(deltaDirection, "deltaDirection");
        return new TitleContentState(title, isTitleLoading, dayDeltaDisplay, deltaDirection, isDayDeltaLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleContentState)) {
            return false;
        }
        TitleContentState titleContentState = (TitleContentState) other;
        return Intrinsics.areEqual(this.title, titleContentState.title) && this.isTitleLoading == titleContentState.isTitleLoading && Intrinsics.areEqual(this.dayDeltaDisplay, titleContentState.dayDeltaDisplay) && this.deltaDirection == titleContentState.deltaDirection && this.isDayDeltaLoading == titleContentState.isDayDeltaLoading;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + Boolean.hashCode(this.isTitleLoading)) * 31) + this.dayDeltaDisplay.hashCode()) * 31) + this.deltaDirection.hashCode()) * 31) + Boolean.hashCode(this.isDayDeltaLoading);
    }

    public String toString() {
        return "TitleContentState(title=" + this.title + ", isTitleLoading=" + this.isTitleLoading + ", dayDeltaDisplay=" + this.dayDeltaDisplay + ", deltaDirection=" + this.deltaDirection + ", isDayDeltaLoading=" + this.isDayDeltaLoading + ")";
    }

    public TitleContentState(StringResource title, boolean z, StringResource dayDeltaDisplay, DeltaDirection deltaDirection, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dayDeltaDisplay, "dayDeltaDisplay");
        Intrinsics.checkNotNullParameter(deltaDirection, "deltaDirection");
        this.title = title;
        this.isTitleLoading = z;
        this.dayDeltaDisplay = dayDeltaDisplay;
        this.deltaDirection = deltaDirection;
        this.isDayDeltaLoading = z2;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final boolean isTitleLoading() {
        return this.isTitleLoading;
    }

    public final StringResource getDayDeltaDisplay() {
        return this.dayDeltaDisplay;
    }

    public final DeltaDirection getDeltaDirection() {
        return this.deltaDirection;
    }

    public final boolean isDayDeltaLoading() {
        return this.isDayDeltaLoading;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TitleContent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState$DeltaDirection;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "NONE", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DeltaDirection {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DeltaDirection[] $VALUES;
        public static final DeltaDirection POSITIVE = new DeltaDirection("POSITIVE", 0);
        public static final DeltaDirection NEGATIVE = new DeltaDirection("NEGATIVE", 1);
        public static final DeltaDirection NONE = new DeltaDirection("NONE", 2);

        private static final /* synthetic */ DeltaDirection[] $values() {
            return new DeltaDirection[]{POSITIVE, NEGATIVE, NONE};
        }

        public static EnumEntries<DeltaDirection> getEntries() {
            return $ENTRIES;
        }

        private DeltaDirection(String str, int i) {
        }

        static {
            DeltaDirection[] deltaDirectionArr$values = $values();
            $VALUES = deltaDirectionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(deltaDirectionArr$values);
        }

        public static DeltaDirection valueOf(String str) {
            return (DeltaDirection) Enum.valueOf(DeltaDirection.class, str);
        }

        public static DeltaDirection[] values() {
            return (DeltaDirection[]) $VALUES.clone();
        }
    }

    /* compiled from: TitleContent.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState$Companion;", "", "<init>", "()V", "createLoadingState", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "dayDeltaDisplay", "deltaDirection", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState$DeltaDirection;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TitleContentState createLoadingState(StringResource title, StringResource dayDeltaDisplay, DeltaDirection deltaDirection) {
            boolean z;
            StringResource stringResourceInvoke = title == null ? StringResource.INSTANCE.invoke("-------") : title;
            boolean z2 = false;
            if (title == null) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            StringResource stringResourceInvoke2 = dayDeltaDisplay == null ? StringResource.INSTANCE.invoke("------------") : dayDeltaDisplay;
            if (deltaDirection == null) {
                deltaDirection = DeltaDirection.NONE;
            }
            return new TitleContentState(stringResourceInvoke, z2, stringResourceInvoke2, deltaDirection, dayDeltaDisplay == null ? true : z);
        }
    }
}
