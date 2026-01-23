package com.robinhood.android.options.lib.simulatedreturn.slider;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnSliderViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick;", "", "relativePosition", "", "<init>", "(F)V", "getRelativePosition", "()F", "SmallTick", "BigTick", "CurrentPriceTick", "PositionPin", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick$BigTick;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick$CurrentPriceTick;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick$PositionPin;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick$SmallTick;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.SliderTick, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionsSimulatedReturnSliderViewState5 {
    public static final int $stable = 0;
    private final float relativePosition;

    public /* synthetic */ OptionsSimulatedReturnSliderViewState5(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    private OptionsSimulatedReturnSliderViewState5(float f) {
        this.relativePosition = f;
    }

    public float getRelativePosition() {
        return this.relativePosition;
    }

    /* compiled from: OptionsSimulatedReturnSliderViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick$SmallTick;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick;", "relativePosition", "", "<init>", "(F)V", "getRelativePosition", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.SliderTick$SmallTick, reason: from toString */
    public static final /* data */ class SmallTick extends OptionsSimulatedReturnSliderViewState5 {
        public static final int $stable = 0;
        private final float relativePosition;

        public static /* synthetic */ SmallTick copy$default(SmallTick smallTick, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = smallTick.relativePosition;
            }
            return smallTick.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getRelativePosition() {
            return this.relativePosition;
        }

        public final SmallTick copy(float relativePosition) {
            return new SmallTick(relativePosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SmallTick) && Float.compare(this.relativePosition, ((SmallTick) other).relativePosition) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.relativePosition);
        }

        public String toString() {
            return "SmallTick(relativePosition=" + this.relativePosition + ")";
        }

        @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState5
        public float getRelativePosition() {
            return this.relativePosition;
        }

        public SmallTick(float f) {
            super(f, null);
            this.relativePosition = f;
        }
    }

    /* compiled from: OptionsSimulatedReturnSliderViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick$BigTick;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick;", "relativePosition", "", "displayPrice", "", "<init>", "(FLjava/lang/String;)V", "getRelativePosition", "()F", "getDisplayPrice", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.SliderTick$BigTick, reason: from toString */
    public static final /* data */ class BigTick extends OptionsSimulatedReturnSliderViewState5 {
        public static final int $stable = 0;
        private final String displayPrice;
        private final float relativePosition;

        public static /* synthetic */ BigTick copy$default(BigTick bigTick, float f, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                f = bigTick.relativePosition;
            }
            if ((i & 2) != 0) {
                str = bigTick.displayPrice;
            }
            return bigTick.copy(f, str);
        }

        /* renamed from: component1, reason: from getter */
        public final float getRelativePosition() {
            return this.relativePosition;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayPrice() {
            return this.displayPrice;
        }

        public final BigTick copy(float relativePosition, String displayPrice) {
            Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
            return new BigTick(relativePosition, displayPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BigTick)) {
                return false;
            }
            BigTick bigTick = (BigTick) other;
            return Float.compare(this.relativePosition, bigTick.relativePosition) == 0 && Intrinsics.areEqual(this.displayPrice, bigTick.displayPrice);
        }

        public int hashCode() {
            return (Float.hashCode(this.relativePosition) * 31) + this.displayPrice.hashCode();
        }

        public String toString() {
            return "BigTick(relativePosition=" + this.relativePosition + ", displayPrice=" + this.displayPrice + ")";
        }

        @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState5
        public float getRelativePosition() {
            return this.relativePosition;
        }

        public final String getDisplayPrice() {
            return this.displayPrice;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BigTick(float f, String displayPrice) {
            super(f, null);
            Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
            this.relativePosition = f;
            this.displayPrice = displayPrice;
        }
    }

    /* compiled from: OptionsSimulatedReturnSliderViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick$CurrentPriceTick;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick;", "relativePosition", "", "<init>", "(F)V", "getRelativePosition", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.SliderTick$CurrentPriceTick, reason: from toString */
    public static final /* data */ class CurrentPriceTick extends OptionsSimulatedReturnSliderViewState5 {
        public static final int $stable = 0;
        private final float relativePosition;

        public static /* synthetic */ CurrentPriceTick copy$default(CurrentPriceTick currentPriceTick, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = currentPriceTick.relativePosition;
            }
            return currentPriceTick.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getRelativePosition() {
            return this.relativePosition;
        }

        public final CurrentPriceTick copy(float relativePosition) {
            return new CurrentPriceTick(relativePosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CurrentPriceTick) && Float.compare(this.relativePosition, ((CurrentPriceTick) other).relativePosition) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.relativePosition);
        }

        public String toString() {
            return "CurrentPriceTick(relativePosition=" + this.relativePosition + ")";
        }

        @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState5
        public float getRelativePosition() {
            return this.relativePosition;
        }

        public CurrentPriceTick(float f) {
            super(f, null);
            this.relativePosition = f;
        }
    }

    /* compiled from: OptionsSimulatedReturnSliderViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick$PositionPin;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick;", "relativePosition", "", "isPast", "", "<init>", "(FZ)V", "getRelativePosition", "()F", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.SliderTick$PositionPin, reason: from toString */
    public static final /* data */ class PositionPin extends OptionsSimulatedReturnSliderViewState5 {
        public static final int $stable = 0;
        private final boolean isPast;
        private final float relativePosition;

        public static /* synthetic */ PositionPin copy$default(PositionPin positionPin, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                f = positionPin.relativePosition;
            }
            if ((i & 2) != 0) {
                z = positionPin.isPast;
            }
            return positionPin.copy(f, z);
        }

        /* renamed from: component1, reason: from getter */
        public final float getRelativePosition() {
            return this.relativePosition;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPast() {
            return this.isPast;
        }

        public final PositionPin copy(float relativePosition, boolean isPast) {
            return new PositionPin(relativePosition, isPast);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionPin)) {
                return false;
            }
            PositionPin positionPin = (PositionPin) other;
            return Float.compare(this.relativePosition, positionPin.relativePosition) == 0 && this.isPast == positionPin.isPast;
        }

        public int hashCode() {
            return (Float.hashCode(this.relativePosition) * 31) + Boolean.hashCode(this.isPast);
        }

        public String toString() {
            return "PositionPin(relativePosition=" + this.relativePosition + ", isPast=" + this.isPast + ")";
        }

        @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState5
        public float getRelativePosition() {
            return this.relativePosition;
        }

        public final boolean isPast() {
            return this.isPast;
        }

        public PositionPin(float f, boolean z) {
            super(f, null);
            this.relativePosition = f;
            this.isPast = z;
        }
    }
}
