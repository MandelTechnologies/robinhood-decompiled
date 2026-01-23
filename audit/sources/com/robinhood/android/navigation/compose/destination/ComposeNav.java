package com.robinhood.android.navigation.compose.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.BottomBarConfig;
import com.robinhood.android.navigation.compose.NavTransition;
import com.robinhood.android.navigation.compose.NavTransition2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeNav.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "Landroid/os/Parcelable;", "<init>", "()V", "dest", "Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "getDest", "()Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "Dest", "DestWithArgs", "SheetDest", "SheetDestWithArgs", "DialogDest", "DialogDestWithArgs", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$Dest;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DestWithArgs;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DialogDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DialogDestWithArgs;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$SheetDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$SheetDestWithArgs;", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class ComposeNav implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ ComposeNav(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract BaseComposableDestination getDest();

    private ComposeNav() {
    }

    /* compiled from: ComposeNav.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/ComposeNav$Dest;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "dest", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", NavTransition2.KEY_TRANSITION, "Lcom/robinhood/android/navigation/compose/NavTransition;", "bottomBarConfig", "Lcom/robinhood/android/navigation/compose/BottomBarConfig;", "<init>", "(Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;Lcom/robinhood/android/navigation/compose/NavTransition;Lcom/robinhood/android/navigation/compose/BottomBarConfig;)V", "getDest", "()Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "getTransition", "()Lcom/robinhood/android/navigation/compose/NavTransition;", "getBottomBarConfig", "()Lcom/robinhood/android/navigation/compose/BottomBarConfig;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Dest extends ComposeNav {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Dest> CREATOR = new Creator();
        private final BottomBarConfig bottomBarConfig;
        private final ComposableDestination dest;
        private final NavTransition transition;

        /* compiled from: ComposeNav.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Dest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Dest createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dest((ComposableDestination) parcel.readParcelable(Dest.class.getClassLoader()), parcel.readInt() == 0 ? null : NavTransition.valueOf(parcel.readString()), (BottomBarConfig) parcel.readParcelable(Dest.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Dest[] newArray(int i) {
                return new Dest[i];
            }
        }

        public static /* synthetic */ Dest copy$default(Dest dest, ComposableDestination composableDestination, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                composableDestination = dest.dest;
            }
            if ((i & 2) != 0) {
                navTransition = dest.transition;
            }
            if ((i & 4) != 0) {
                bottomBarConfig = dest.bottomBarConfig;
            }
            return dest.copy(composableDestination, navTransition, bottomBarConfig);
        }

        /* renamed from: component1, reason: from getter */
        public final ComposableDestination getDest() {
            return this.dest;
        }

        /* renamed from: component2, reason: from getter */
        public final NavTransition getTransition() {
            return this.transition;
        }

        /* renamed from: component3, reason: from getter */
        public final BottomBarConfig getBottomBarConfig() {
            return this.bottomBarConfig;
        }

        public final Dest copy(ComposableDestination dest, NavTransition transition, BottomBarConfig bottomBarConfig) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            return new Dest(dest, transition, bottomBarConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dest)) {
                return false;
            }
            Dest dest = (Dest) other;
            return Intrinsics.areEqual(this.dest, dest.dest) && this.transition == dest.transition && Intrinsics.areEqual(this.bottomBarConfig, dest.bottomBarConfig);
        }

        public int hashCode() {
            int iHashCode = this.dest.hashCode() * 31;
            NavTransition navTransition = this.transition;
            int iHashCode2 = (iHashCode + (navTransition == null ? 0 : navTransition.hashCode())) * 31;
            BottomBarConfig bottomBarConfig = this.bottomBarConfig;
            return iHashCode2 + (bottomBarConfig != null ? bottomBarConfig.hashCode() : 0);
        }

        public String toString() {
            return "Dest(dest=" + this.dest + ", transition=" + this.transition + ", bottomBarConfig=" + this.bottomBarConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.dest, flags);
            NavTransition navTransition = this.transition;
            if (navTransition == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(navTransition.name());
            }
            dest.writeParcelable(this.bottomBarConfig, flags);
        }

        public /* synthetic */ Dest(ComposableDestination composableDestination, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(composableDestination, (i & 2) != 0 ? null : navTransition, (i & 4) != 0 ? null : bottomBarConfig);
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposeNav
        public ComposableDestination getDest() {
            return this.dest;
        }

        public final NavTransition getTransition() {
            return this.transition;
        }

        public final BottomBarConfig getBottomBarConfig() {
            return this.bottomBarConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dest(ComposableDestination dest, NavTransition navTransition, BottomBarConfig bottomBarConfig) {
            super(null);
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.dest = dest;
            this.transition = navTransition;
            this.bottomBarConfig = bottomBarConfig;
        }
    }

    /* compiled from: ComposeNav.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\b\u0000\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DestWithArgs;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "dest", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "args", "Landroid/os/Parcelable;", NavTransition2.KEY_TRANSITION, "Lcom/robinhood/android/navigation/compose/NavTransition;", "bottomBarConfig", "Lcom/robinhood/android/navigation/compose/BottomBarConfig;", "<init>", "(Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;Landroid/os/Parcelable;Lcom/robinhood/android/navigation/compose/NavTransition;Lcom/robinhood/android/navigation/compose/BottomBarConfig;)V", "getDest", "()Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "getArgs", "()Landroid/os/Parcelable;", "getTransition", "()Lcom/robinhood/android/navigation/compose/NavTransition;", "getBottomBarConfig", "()Lcom/robinhood/android/navigation/compose/BottomBarConfig;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DestWithArgs extends ComposeNav {
        public static final int $stable = 8;
        public static final Parcelable.Creator<DestWithArgs> CREATOR = new Creator();
        private final Parcelable args;
        private final BottomBarConfig bottomBarConfig;
        private final ComposableDestinationWithArgs<?> dest;
        private final NavTransition transition;

        /* compiled from: ComposeNav.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DestWithArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DestWithArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DestWithArgs((ComposableDestinationWithArgs) parcel.readParcelable(DestWithArgs.class.getClassLoader()), parcel.readParcelable(DestWithArgs.class.getClassLoader()), parcel.readInt() == 0 ? null : NavTransition.valueOf(parcel.readString()), (BottomBarConfig) parcel.readParcelable(DestWithArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DestWithArgs[] newArray(int i) {
                return new DestWithArgs[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DestWithArgs copy$default(DestWithArgs destWithArgs, ComposableDestinationWithArgs composableDestinationWithArgs, Parcelable parcelable, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                composableDestinationWithArgs = destWithArgs.dest;
            }
            if ((i & 2) != 0) {
                parcelable = destWithArgs.args;
            }
            if ((i & 4) != 0) {
                navTransition = destWithArgs.transition;
            }
            if ((i & 8) != 0) {
                bottomBarConfig = destWithArgs.bottomBarConfig;
            }
            return destWithArgs.copy(composableDestinationWithArgs, parcelable, navTransition, bottomBarConfig);
        }

        public final ComposableDestinationWithArgs<?> component1() {
            return this.dest;
        }

        /* renamed from: component2, reason: from getter */
        public final Parcelable getArgs() {
            return this.args;
        }

        /* renamed from: component3, reason: from getter */
        public final NavTransition getTransition() {
            return this.transition;
        }

        /* renamed from: component4, reason: from getter */
        public final BottomBarConfig getBottomBarConfig() {
            return this.bottomBarConfig;
        }

        public final DestWithArgs copy(ComposableDestinationWithArgs<?> dest, Parcelable args, NavTransition transition, BottomBarConfig bottomBarConfig) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(args, "args");
            return new DestWithArgs(dest, args, transition, bottomBarConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DestWithArgs)) {
                return false;
            }
            DestWithArgs destWithArgs = (DestWithArgs) other;
            return Intrinsics.areEqual(this.dest, destWithArgs.dest) && Intrinsics.areEqual(this.args, destWithArgs.args) && this.transition == destWithArgs.transition && Intrinsics.areEqual(this.bottomBarConfig, destWithArgs.bottomBarConfig);
        }

        public int hashCode() {
            int iHashCode = ((this.dest.hashCode() * 31) + this.args.hashCode()) * 31;
            NavTransition navTransition = this.transition;
            int iHashCode2 = (iHashCode + (navTransition == null ? 0 : navTransition.hashCode())) * 31;
            BottomBarConfig bottomBarConfig = this.bottomBarConfig;
            return iHashCode2 + (bottomBarConfig != null ? bottomBarConfig.hashCode() : 0);
        }

        public String toString() {
            return "DestWithArgs(dest=" + this.dest + ", args=" + this.args + ", transition=" + this.transition + ", bottomBarConfig=" + this.bottomBarConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.dest, flags);
            dest.writeParcelable(this.args, flags);
            NavTransition navTransition = this.transition;
            if (navTransition == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(navTransition.name());
            }
            dest.writeParcelable(this.bottomBarConfig, flags);
        }

        public /* synthetic */ DestWithArgs(ComposableDestinationWithArgs composableDestinationWithArgs, Parcelable parcelable, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(composableDestinationWithArgs, parcelable, (i & 4) != 0 ? null : navTransition, (i & 8) != 0 ? null : bottomBarConfig);
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposeNav
        public ComposableDestinationWithArgs<?> getDest() {
            return this.dest;
        }

        public final Parcelable getArgs() {
            return this.args;
        }

        public final NavTransition getTransition() {
            return this.transition;
        }

        public final BottomBarConfig getBottomBarConfig() {
            return this.bottomBarConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DestWithArgs(ComposableDestinationWithArgs<?> dest, Parcelable args, NavTransition navTransition, BottomBarConfig bottomBarConfig) {
            super(null);
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(args, "args");
            this.dest = dest;
            this.args = args;
            this.transition = navTransition;
            this.bottomBarConfig = bottomBarConfig;
        }
    }

    /* compiled from: ComposeNav.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/ComposeNav$SheetDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "dest", "Lcom/robinhood/android/navigation/compose/destination/SheetDestination;", "<init>", "(Lcom/robinhood/android/navigation/compose/destination/SheetDestination;)V", "getDest", "()Lcom/robinhood/android/navigation/compose/destination/SheetDestination;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SheetDest extends ComposeNav {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SheetDest> CREATOR = new Creator();
        private final SheetDestination dest;

        /* compiled from: ComposeNav.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SheetDest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SheetDest createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SheetDest((SheetDestination) parcel.readParcelable(SheetDest.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SheetDest[] newArray(int i) {
                return new SheetDest[i];
            }
        }

        public static /* synthetic */ SheetDest copy$default(SheetDest sheetDest, SheetDestination sheetDestination, int i, Object obj) {
            if ((i & 1) != 0) {
                sheetDestination = sheetDest.dest;
            }
            return sheetDest.copy(sheetDestination);
        }

        /* renamed from: component1, reason: from getter */
        public final SheetDestination getDest() {
            return this.dest;
        }

        public final SheetDest copy(SheetDestination dest) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            return new SheetDest(dest);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SheetDest) && Intrinsics.areEqual(this.dest, ((SheetDest) other).dest);
        }

        public int hashCode() {
            return this.dest.hashCode();
        }

        public String toString() {
            return "SheetDest(dest=" + this.dest + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.dest, flags);
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposeNav
        public SheetDestination getDest() {
            return this.dest;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SheetDest(SheetDestination dest) {
            super(null);
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.dest = dest;
        }
    }

    /* compiled from: ComposeNav.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/ComposeNav$SheetDestWithArgs;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "dest", "Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;", "args", "Landroid/os/Parcelable;", "<init>", "(Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;Landroid/os/Parcelable;)V", "getDest", "()Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;", "getArgs", "()Landroid/os/Parcelable;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SheetDestWithArgs extends ComposeNav {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SheetDestWithArgs> CREATOR = new Creator();
        private final Parcelable args;
        private final SheetDestinationWithArgs<?> dest;

        /* compiled from: ComposeNav.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SheetDestWithArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SheetDestWithArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SheetDestWithArgs((SheetDestinationWithArgs) parcel.readParcelable(SheetDestWithArgs.class.getClassLoader()), parcel.readParcelable(SheetDestWithArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SheetDestWithArgs[] newArray(int i) {
                return new SheetDestWithArgs[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SheetDestWithArgs copy$default(SheetDestWithArgs sheetDestWithArgs, SheetDestinationWithArgs sheetDestinationWithArgs, Parcelable parcelable, int i, Object obj) {
            if ((i & 1) != 0) {
                sheetDestinationWithArgs = sheetDestWithArgs.dest;
            }
            if ((i & 2) != 0) {
                parcelable = sheetDestWithArgs.args;
            }
            return sheetDestWithArgs.copy(sheetDestinationWithArgs, parcelable);
        }

        public final SheetDestinationWithArgs<?> component1() {
            return this.dest;
        }

        /* renamed from: component2, reason: from getter */
        public final Parcelable getArgs() {
            return this.args;
        }

        public final SheetDestWithArgs copy(SheetDestinationWithArgs<?> dest, Parcelable args) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(args, "args");
            return new SheetDestWithArgs(dest, args);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SheetDestWithArgs)) {
                return false;
            }
            SheetDestWithArgs sheetDestWithArgs = (SheetDestWithArgs) other;
            return Intrinsics.areEqual(this.dest, sheetDestWithArgs.dest) && Intrinsics.areEqual(this.args, sheetDestWithArgs.args);
        }

        public int hashCode() {
            return (this.dest.hashCode() * 31) + this.args.hashCode();
        }

        public String toString() {
            return "SheetDestWithArgs(dest=" + this.dest + ", args=" + this.args + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.dest, flags);
            dest.writeParcelable(this.args, flags);
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposeNav
        public SheetDestinationWithArgs<?> getDest() {
            return this.dest;
        }

        public final Parcelable getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SheetDestWithArgs(SheetDestinationWithArgs<?> dest, Parcelable args) {
            super(null);
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(args, "args");
            this.dest = dest;
            this.args = args;
        }
    }

    /* compiled from: ComposeNav.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DialogDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "dest", "Lcom/robinhood/android/navigation/compose/destination/DialogDestination;", "<init>", "(Lcom/robinhood/android/navigation/compose/destination/DialogDestination;)V", "getDest", "()Lcom/robinhood/android/navigation/compose/destination/DialogDestination;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DialogDest extends ComposeNav {
        public static final int $stable = 0;
        public static final Parcelable.Creator<DialogDest> CREATOR = new Creator();
        private final DialogDestination dest;

        /* compiled from: ComposeNav.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DialogDest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DialogDest createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DialogDest((DialogDestination) parcel.readParcelable(DialogDest.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DialogDest[] newArray(int i) {
                return new DialogDest[i];
            }
        }

        public static /* synthetic */ DialogDest copy$default(DialogDest dialogDest, DialogDestination dialogDestination, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogDestination = dialogDest.dest;
            }
            return dialogDest.copy(dialogDestination);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogDestination getDest() {
            return this.dest;
        }

        public final DialogDest copy(DialogDestination dest) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            return new DialogDest(dest);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DialogDest) && Intrinsics.areEqual(this.dest, ((DialogDest) other).dest);
        }

        public int hashCode() {
            return this.dest.hashCode();
        }

        public String toString() {
            return "DialogDest(dest=" + this.dest + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.dest, flags);
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposeNav
        public DialogDestination getDest() {
            return this.dest;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogDest(DialogDestination dest) {
            super(null);
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.dest = dest;
        }
    }

    /* compiled from: ComposeNav.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DialogDestWithArgs;", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "dest", "Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;", "args", "Landroid/os/Parcelable;", "<init>", "(Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;Landroid/os/Parcelable;)V", "getDest", "()Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;", "getArgs", "()Landroid/os/Parcelable;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DialogDestWithArgs extends ComposeNav {
        public static final int $stable = 8;
        public static final Parcelable.Creator<DialogDestWithArgs> CREATOR = new Creator();
        private final Parcelable args;
        private final DialogDestinationWithArgs<?> dest;

        /* compiled from: ComposeNav.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DialogDestWithArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DialogDestWithArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DialogDestWithArgs((DialogDestinationWithArgs) parcel.readParcelable(DialogDestWithArgs.class.getClassLoader()), parcel.readParcelable(DialogDestWithArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DialogDestWithArgs[] newArray(int i) {
                return new DialogDestWithArgs[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DialogDestWithArgs copy$default(DialogDestWithArgs dialogDestWithArgs, DialogDestinationWithArgs dialogDestinationWithArgs, Parcelable parcelable, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogDestinationWithArgs = dialogDestWithArgs.dest;
            }
            if ((i & 2) != 0) {
                parcelable = dialogDestWithArgs.args;
            }
            return dialogDestWithArgs.copy(dialogDestinationWithArgs, parcelable);
        }

        public final DialogDestinationWithArgs<?> component1() {
            return this.dest;
        }

        /* renamed from: component2, reason: from getter */
        public final Parcelable getArgs() {
            return this.args;
        }

        public final DialogDestWithArgs copy(DialogDestinationWithArgs<?> dest, Parcelable args) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(args, "args");
            return new DialogDestWithArgs(dest, args);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogDestWithArgs)) {
                return false;
            }
            DialogDestWithArgs dialogDestWithArgs = (DialogDestWithArgs) other;
            return Intrinsics.areEqual(this.dest, dialogDestWithArgs.dest) && Intrinsics.areEqual(this.args, dialogDestWithArgs.args);
        }

        public int hashCode() {
            return (this.dest.hashCode() * 31) + this.args.hashCode();
        }

        public String toString() {
            return "DialogDestWithArgs(dest=" + this.dest + ", args=" + this.args + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.dest, flags);
            dest.writeParcelable(this.args, flags);
        }

        @Override // com.robinhood.android.navigation.compose.destination.ComposeNav
        public DialogDestinationWithArgs<?> getDest() {
            return this.dest;
        }

        public final Parcelable getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogDestWithArgs(DialogDestinationWithArgs<?> dest, Parcelable args) {
            super(null);
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(args, "args");
            this.dest = dest;
            this.args = args;
        }
    }
}
