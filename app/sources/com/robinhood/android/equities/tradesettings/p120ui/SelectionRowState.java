package com.robinhood.android.equities.tradesettings.p120ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectionRowState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "T", "Landroid/os/Parcelable;", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "showNewTag", "", "<init>", "(Landroid/os/Parcelable;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getOption", "()Landroid/os/Parcelable;", "Landroid/os/Parcelable;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "getShowNewTag", "()Z", "component1", "component2", "component3", "component4", "copy", "(Landroid/os/Parcelable;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectionRowState<T extends Parcelable> implements Parcelable {
    public static final int $stable = StringResource.$stable;
    public static final Parcelable.Creator<SelectionRowState<?>> CREATOR = new Creator();
    private final T option;
    private final StringResource primaryText;
    private final StringResource secondaryText;
    private final boolean showNewTag;

    /* compiled from: SelectionRowState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectionRowState<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectionRowState<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectionRowState<>(parcel.readParcelable(SelectionRowState.class.getClassLoader()), (StringResource) parcel.readParcelable(SelectionRowState.class.getClassLoader()), (StringResource) parcel.readParcelable(SelectionRowState.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectionRowState<?>[] newArray(int i) {
            return new SelectionRowState[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectionRowState copy$default(SelectionRowState selectionRowState, Parcelable parcelable, StringResource stringResource, StringResource stringResource2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            parcelable = selectionRowState.option;
        }
        if ((i & 2) != 0) {
            stringResource = selectionRowState.primaryText;
        }
        if ((i & 4) != 0) {
            stringResource2 = selectionRowState.secondaryText;
        }
        if ((i & 8) != 0) {
            z = selectionRowState.showNewTag;
        }
        return selectionRowState.copy(parcelable, stringResource, stringResource2, z);
    }

    public final T component1() {
        return this.option;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowNewTag() {
        return this.showNewTag;
    }

    public final SelectionRowState<T> copy(T option, StringResource primaryText, StringResource secondaryText, boolean showNewTag) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        return new SelectionRowState<>(option, primaryText, secondaryText, showNewTag);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionRowState)) {
            return false;
        }
        SelectionRowState selectionRowState = (SelectionRowState) other;
        return Intrinsics.areEqual(this.option, selectionRowState.option) && Intrinsics.areEqual(this.primaryText, selectionRowState.primaryText) && Intrinsics.areEqual(this.secondaryText, selectionRowState.secondaryText) && this.showNewTag == selectionRowState.showNewTag;
    }

    public int hashCode() {
        return (((((this.option.hashCode() * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + Boolean.hashCode(this.showNewTag);
    }

    public String toString() {
        return "SelectionRowState(option=" + this.option + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", showNewTag=" + this.showNewTag + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.option, flags);
        dest.writeParcelable(this.primaryText, flags);
        dest.writeParcelable(this.secondaryText, flags);
        dest.writeInt(this.showNewTag ? 1 : 0);
    }

    public SelectionRowState(T option, StringResource primaryText, StringResource secondaryText, boolean z) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        this.option = option;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.showNewTag = z;
    }

    public /* synthetic */ SelectionRowState(Parcelable parcelable, StringResource stringResource, StringResource stringResource2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelable, stringResource, stringResource2, (i & 8) != 0 ? false : z);
    }

    public final T getOption() {
        return this.option;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final boolean getShowNewTag() {
        return this.showNewTag;
    }
}
