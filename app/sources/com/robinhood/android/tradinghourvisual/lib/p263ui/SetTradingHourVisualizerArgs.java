package com.robinhood.android.tradinghourvisual.lib.p263ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: SetTradingHourVisualizerArgs.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0001BB\u0087\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010)J\"\u0010+\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J \u0001\u0010/\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b3\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010#R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b6\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b7\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b8\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b=\u0010)R)\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010,R#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010.¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "Landroid/os/Parcelable;", "Lkotlinx/collections/immutable/ImmutableList;", "", "leftEdgeText", "rightEdgeText", "leftBoundaryText", "rightBoundaryText", "", "numPegs", "j$/time/Instant", "leftEdgeInstant", "rightEdgeInstant", "Lkotlin/Pair;", "selectedMarketHoursOpenClose", "Lkotlin/Function0;", "Lkotlinx/collections/immutable/PersistentList;", "Landroidx/compose/ui/graphics/Color;", "getGradientColor", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ILj$/time/Instant;Lj$/time/Instant;Lkotlin/Pair;Lkotlin/jvm/functions/Function2;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lkotlinx/collections/immutable/ImmutableList;", "component2", "component3", "component4", "component5", "component6", "()Lj$/time/Instant;", "component7", "component8", "()Lkotlin/Pair;", "component9", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ILj$/time/Instant;Lj$/time/Instant;Lkotlin/Pair;Lkotlin/jvm/functions/Function2;)Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "toString", "()Ljava/lang/String;", "hashCode", "Lkotlinx/collections/immutable/ImmutableList;", "getLeftEdgeText", "getRightEdgeText", "getLeftBoundaryText", "getRightBoundaryText", "I", "getNumPegs", "Lj$/time/Instant;", "getLeftEdgeInstant", "getRightEdgeInstant", "Lkotlin/Pair;", "getSelectedMarketHoursOpenClose", "Lkotlin/jvm/functions/Function2;", "getGetGradientColor", "Companion", "lib-trade-hour-visualizer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SetTradingHourVisualizerArgs implements Parcelable {
    public static final int TRADE_VISUALIZER_NUM_PEGS = 25;
    private final Function2<Composer, Integer, ImmutableList3<Color>> getGradientColor;
    private final ImmutableList<String> leftBoundaryText;
    private final Instant leftEdgeInstant;
    private final ImmutableList<String> leftEdgeText;
    private final int numPegs;
    private final ImmutableList<String> rightBoundaryText;
    private final Instant rightEdgeInstant;
    private final ImmutableList<String> rightEdgeText;
    private final Tuples2<Instant, Instant> selectedMarketHoursOpenClose;
    public static final int $stable = 8;
    public static final Parcelable.Creator<SetTradingHourVisualizerArgs> CREATOR = new Creator();

    /* compiled from: SetTradingHourVisualizerArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SetTradingHourVisualizerArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetTradingHourVisualizerArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetTradingHourVisualizerArgs(extensions2.toPersistentList(parcel.createStringArrayList()), extensions2.toPersistentList(parcel.createStringArrayList()), extensions2.toPersistentList(parcel.createStringArrayList()), extensions2.toPersistentList(parcel.createStringArrayList()), parcel.readInt(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Tuples2) parcel.readSerializable(), (Function2) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetTradingHourVisualizerArgs[] newArray(int i) {
            return new SetTradingHourVisualizerArgs[i];
        }
    }

    public static /* synthetic */ SetTradingHourVisualizerArgs copy$default(SetTradingHourVisualizerArgs setTradingHourVisualizerArgs, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, int i, Instant instant, Instant instant2, Tuples2 tuples2, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            immutableList = setTradingHourVisualizerArgs.leftEdgeText;
        }
        if ((i2 & 2) != 0) {
            immutableList2 = setTradingHourVisualizerArgs.rightEdgeText;
        }
        if ((i2 & 4) != 0) {
            immutableList3 = setTradingHourVisualizerArgs.leftBoundaryText;
        }
        if ((i2 & 8) != 0) {
            immutableList4 = setTradingHourVisualizerArgs.rightBoundaryText;
        }
        if ((i2 & 16) != 0) {
            i = setTradingHourVisualizerArgs.numPegs;
        }
        if ((i2 & 32) != 0) {
            instant = setTradingHourVisualizerArgs.leftEdgeInstant;
        }
        if ((i2 & 64) != 0) {
            instant2 = setTradingHourVisualizerArgs.rightEdgeInstant;
        }
        if ((i2 & 128) != 0) {
            tuples2 = setTradingHourVisualizerArgs.selectedMarketHoursOpenClose;
        }
        if ((i2 & 256) != 0) {
            function2 = setTradingHourVisualizerArgs.getGradientColor;
        }
        Tuples2 tuples22 = tuples2;
        Function2 function22 = function2;
        Instant instant3 = instant;
        Instant instant4 = instant2;
        int i3 = i;
        ImmutableList immutableList5 = immutableList3;
        return setTradingHourVisualizerArgs.copy(immutableList, immutableList2, immutableList5, immutableList4, i3, instant3, instant4, tuples22, function22);
    }

    public final ImmutableList<String> component1() {
        return this.leftEdgeText;
    }

    public final ImmutableList<String> component2() {
        return this.rightEdgeText;
    }

    public final ImmutableList<String> component3() {
        return this.leftBoundaryText;
    }

    public final ImmutableList<String> component4() {
        return this.rightBoundaryText;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNumPegs() {
        return this.numPegs;
    }

    /* renamed from: component6, reason: from getter */
    public final Instant getLeftEdgeInstant() {
        return this.leftEdgeInstant;
    }

    /* renamed from: component7, reason: from getter */
    public final Instant getRightEdgeInstant() {
        return this.rightEdgeInstant;
    }

    public final Tuples2<Instant, Instant> component8() {
        return this.selectedMarketHoursOpenClose;
    }

    public final Function2<Composer, Integer, ImmutableList3<Color>> component9() {
        return this.getGradientColor;
    }

    public final SetTradingHourVisualizerArgs copy(ImmutableList<String> leftEdgeText, ImmutableList<String> rightEdgeText, ImmutableList<String> leftBoundaryText, ImmutableList<String> rightBoundaryText, int numPegs, Instant leftEdgeInstant, Instant rightEdgeInstant, Tuples2<Instant, Instant> selectedMarketHoursOpenClose, Function2<? super Composer, ? super Integer, ? extends ImmutableList3<Color>> getGradientColor) {
        Intrinsics.checkNotNullParameter(leftEdgeText, "leftEdgeText");
        Intrinsics.checkNotNullParameter(rightEdgeText, "rightEdgeText");
        Intrinsics.checkNotNullParameter(leftBoundaryText, "leftBoundaryText");
        Intrinsics.checkNotNullParameter(rightBoundaryText, "rightBoundaryText");
        Intrinsics.checkNotNullParameter(leftEdgeInstant, "leftEdgeInstant");
        Intrinsics.checkNotNullParameter(rightEdgeInstant, "rightEdgeInstant");
        Intrinsics.checkNotNullParameter(getGradientColor, "getGradientColor");
        return new SetTradingHourVisualizerArgs(leftEdgeText, rightEdgeText, leftBoundaryText, rightBoundaryText, numPegs, leftEdgeInstant, rightEdgeInstant, selectedMarketHoursOpenClose, getGradientColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.leftEdgeText.hashCode() * 31) + this.rightEdgeText.hashCode()) * 31) + this.leftBoundaryText.hashCode()) * 31) + this.rightBoundaryText.hashCode()) * 31) + Integer.hashCode(this.numPegs)) * 31) + this.leftEdgeInstant.hashCode()) * 31) + this.rightEdgeInstant.hashCode()) * 31;
        Tuples2<Instant, Instant> tuples2 = this.selectedMarketHoursOpenClose;
        return ((iHashCode + (tuples2 == null ? 0 : tuples2.hashCode())) * 31) + this.getGradientColor.hashCode();
    }

    public String toString() {
        return "SetTradingHourVisualizerArgs(leftEdgeText=" + this.leftEdgeText + ", rightEdgeText=" + this.rightEdgeText + ", leftBoundaryText=" + this.leftBoundaryText + ", rightBoundaryText=" + this.rightBoundaryText + ", numPegs=" + this.numPegs + ", leftEdgeInstant=" + this.leftEdgeInstant + ", rightEdgeInstant=" + this.rightEdgeInstant + ", selectedMarketHoursOpenClose=" + this.selectedMarketHoursOpenClose + ", getGradientColor=" + this.getGradientColor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.leftEdgeText);
        dest.writeStringList(this.rightEdgeText);
        dest.writeStringList(this.leftBoundaryText);
        dest.writeStringList(this.rightBoundaryText);
        dest.writeInt(this.numPegs);
        dest.writeSerializable(this.leftEdgeInstant);
        dest.writeSerializable(this.rightEdgeInstant);
        dest.writeSerializable(this.selectedMarketHoursOpenClose);
        dest.writeSerializable((Serializable) this.getGradientColor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetTradingHourVisualizerArgs(ImmutableList<String> leftEdgeText, ImmutableList<String> rightEdgeText, ImmutableList<String> leftBoundaryText, ImmutableList<String> rightBoundaryText, int i, Instant leftEdgeInstant, Instant rightEdgeInstant, Tuples2<Instant, Instant> tuples2, Function2<? super Composer, ? super Integer, ? extends ImmutableList3<Color>> getGradientColor) {
        Intrinsics.checkNotNullParameter(leftEdgeText, "leftEdgeText");
        Intrinsics.checkNotNullParameter(rightEdgeText, "rightEdgeText");
        Intrinsics.checkNotNullParameter(leftBoundaryText, "leftBoundaryText");
        Intrinsics.checkNotNullParameter(rightBoundaryText, "rightBoundaryText");
        Intrinsics.checkNotNullParameter(leftEdgeInstant, "leftEdgeInstant");
        Intrinsics.checkNotNullParameter(rightEdgeInstant, "rightEdgeInstant");
        Intrinsics.checkNotNullParameter(getGradientColor, "getGradientColor");
        this.leftEdgeText = leftEdgeText;
        this.rightEdgeText = rightEdgeText;
        this.leftBoundaryText = leftBoundaryText;
        this.rightBoundaryText = rightBoundaryText;
        this.numPegs = i;
        this.leftEdgeInstant = leftEdgeInstant;
        this.rightEdgeInstant = rightEdgeInstant;
        this.selectedMarketHoursOpenClose = tuples2;
        this.getGradientColor = getGradientColor;
    }

    public /* synthetic */ SetTradingHourVisualizerArgs(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, int i, Instant instant, Instant instant2, Tuples2 tuples2, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, immutableList2, immutableList3, immutableList4, (i2 & 16) != 0 ? 25 : i, instant, instant2, tuples2, function2);
    }

    public final ImmutableList<String> getLeftEdgeText() {
        return this.leftEdgeText;
    }

    public final ImmutableList<String> getRightEdgeText() {
        return this.rightEdgeText;
    }

    public final ImmutableList<String> getLeftBoundaryText() {
        return this.leftBoundaryText;
    }

    public final ImmutableList<String> getRightBoundaryText() {
        return this.rightBoundaryText;
    }

    public final int getNumPegs() {
        return this.numPegs;
    }

    public final Instant getLeftEdgeInstant() {
        return this.leftEdgeInstant;
    }

    public final Instant getRightEdgeInstant() {
        return this.rightEdgeInstant;
    }

    public final Tuples2<Instant, Instant> getSelectedMarketHoursOpenClose() {
        return this.selectedMarketHoursOpenClose;
    }

    public final Function2<Composer, Integer, ImmutableList3<Color>> getGetGradientColor() {
        return this.getGradientColor;
    }

    public boolean equals(Object other) {
        SetTradingHourVisualizerArgs setTradingHourVisualizerArgs = other instanceof SetTradingHourVisualizerArgs ? (SetTradingHourVisualizerArgs) other : null;
        return setTradingHourVisualizerArgs != null && Intrinsics.areEqual(this.leftEdgeText, setTradingHourVisualizerArgs.leftEdgeText) && Intrinsics.areEqual(this.rightEdgeText, setTradingHourVisualizerArgs.rightEdgeText) && Intrinsics.areEqual(this.leftBoundaryText, setTradingHourVisualizerArgs.leftBoundaryText) && Intrinsics.areEqual(this.rightBoundaryText, setTradingHourVisualizerArgs.rightBoundaryText) && this.numPegs == setTradingHourVisualizerArgs.numPegs && Intrinsics.areEqual(this.leftEdgeInstant, setTradingHourVisualizerArgs.leftEdgeInstant) && Intrinsics.areEqual(this.rightEdgeInstant, setTradingHourVisualizerArgs.rightEdgeInstant) && Intrinsics.areEqual(this.selectedMarketHoursOpenClose, setTradingHourVisualizerArgs.selectedMarketHoursOpenClose);
    }
}
