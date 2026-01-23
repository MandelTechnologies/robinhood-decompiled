package com.robinhood.android.gold.upgrade.unified;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUnifiedDestinations.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/ValuePropsPromoDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/android/gold/upgrade/unified/ValuePropsPromoDest$Args;", "<init>", "()V", "Args", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ValuePropsPromoDest extends ComposableDestinationWithArgs<Args> {
    public static final ValuePropsPromoDest INSTANCE = new ValuePropsPromoDest();
    public static final int $stable = ComposableDestinationWithArgs.$stable;

    private ValuePropsPromoDest() {
        super("VALUE_PROPS_PROMO", Args.class, null, null, null, 28, null);
    }

    /* compiled from: GoldUnifiedDestinations.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/ValuePropsPromoDest$Args;", "Landroid/os/Parcelable;", "buttonColorChangeWhenScrolling", "", "screenLoggingIdentifier", "", "forceLightMode", "<init>", "(ZLjava/lang/String;Z)V", "getButtonColorChangeWhenScrolling", "()Z", "getScreenLoggingIdentifier", "()Ljava/lang/String;", "getForceLightMode", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean buttonColorChangeWhenScrolling;
        private final boolean forceLightMode;
        private final String screenLoggingIdentifier;

        /* compiled from: GoldUnifiedDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args() {
            this(false, null, false, 7, null);
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.buttonColorChangeWhenScrolling;
            }
            if ((i & 2) != 0) {
                str = args.screenLoggingIdentifier;
            }
            if ((i & 4) != 0) {
                z2 = args.forceLightMode;
            }
            return args.copy(z, str, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getButtonColorChangeWhenScrolling() {
            return this.buttonColorChangeWhenScrolling;
        }

        /* renamed from: component2, reason: from getter */
        public final String getScreenLoggingIdentifier() {
            return this.screenLoggingIdentifier;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getForceLightMode() {
            return this.forceLightMode;
        }

        public final Args copy(boolean buttonColorChangeWhenScrolling, String screenLoggingIdentifier, boolean forceLightMode) {
            return new Args(buttonColorChangeWhenScrolling, screenLoggingIdentifier, forceLightMode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.buttonColorChangeWhenScrolling == args.buttonColorChangeWhenScrolling && Intrinsics.areEqual(this.screenLoggingIdentifier, args.screenLoggingIdentifier) && this.forceLightMode == args.forceLightMode;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.buttonColorChangeWhenScrolling) * 31;
            String str = this.screenLoggingIdentifier;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.forceLightMode);
        }

        public String toString() {
            return "Args(buttonColorChangeWhenScrolling=" + this.buttonColorChangeWhenScrolling + ", screenLoggingIdentifier=" + this.screenLoggingIdentifier + ", forceLightMode=" + this.forceLightMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.buttonColorChangeWhenScrolling ? 1 : 0);
            dest.writeString(this.screenLoggingIdentifier);
            dest.writeInt(this.forceLightMode ? 1 : 0);
        }

        public Args(boolean z, String str, boolean z2) {
            this.buttonColorChangeWhenScrolling = z;
            this.screenLoggingIdentifier = str;
            this.forceLightMode = z2;
        }

        public /* synthetic */ Args(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2);
        }

        public final boolean getButtonColorChangeWhenScrolling() {
            return this.buttonColorChangeWhenScrolling;
        }

        public final String getScreenLoggingIdentifier() {
            return this.screenLoggingIdentifier;
        }

        public final boolean getForceLightMode() {
            return this.forceLightMode;
        }
    }
}
