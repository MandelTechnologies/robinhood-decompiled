package com.robinhood.android.internalassettransfers.presubmissionwarn;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PresubmissionCheckAlertSheets.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/Button;", "Landroid/os/Parcelable;", "text", "Lcom/robinhood/utils/resource/StringResource;", "action", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getAction", "()Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Button implements Parcelable {
    public static final int $stable = StringResource.$stable;
    public static final Parcelable.Creator<Button> CREATOR = new Creator();
    private final PresubmissionCheckAlertSheets2 action;
    private final StringResource text;

    /* compiled from: PresubmissionCheckAlertSheets.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<Button> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Button createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Button((StringResource) parcel.readParcelable(Button.class.getClassLoader()), (PresubmissionCheckAlertSheets2) parcel.readParcelable(Button.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Button[] newArray(int i) {
            return new Button[i];
        }
    }

    public static /* synthetic */ Button copy$default(Button button, StringResource stringResource, PresubmissionCheckAlertSheets2 presubmissionCheckAlertSheets2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = button.text;
        }
        if ((i & 2) != 0) {
            presubmissionCheckAlertSheets2 = button.action;
        }
        return button.copy(stringResource, presubmissionCheckAlertSheets2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final PresubmissionCheckAlertSheets2 getAction() {
        return this.action;
    }

    public final Button copy(StringResource text, PresubmissionCheckAlertSheets2 action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        return new Button(text, action);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Button)) {
            return false;
        }
        Button button = (Button) other;
        return Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.action, button.action);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "Button(text=" + this.text + ", action=" + this.action + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.text, flags);
        dest.writeParcelable(this.action, flags);
    }

    public Button(StringResource text, PresubmissionCheckAlertSheets2 action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.text = text;
        this.action = action;
    }

    public final StringResource getText() {
        return this.text;
    }

    public final PresubmissionCheckAlertSheets2 getAction() {
        return this.action;
    }
}
