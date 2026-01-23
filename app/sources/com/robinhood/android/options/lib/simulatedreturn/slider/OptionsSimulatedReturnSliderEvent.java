package com.robinhood.android.options.lib.simulatedreturn.slider;

import kotlin.Metadata;

/* compiled from: OptionsSimulatedReturnSliderEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderEvent;", "", "SliderHapticFeedback", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderEvent$SliderHapticFeedback;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface OptionsSimulatedReturnSliderEvent {

    /* compiled from: OptionsSimulatedReturnSliderEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderEvent$SliderHapticFeedback;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderEvent;", "isStrong", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SliderHapticFeedback implements OptionsSimulatedReturnSliderEvent {
        public static final int $stable = 0;
        private final boolean isStrong;

        public static /* synthetic */ SliderHapticFeedback copy$default(SliderHapticFeedback sliderHapticFeedback, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = sliderHapticFeedback.isStrong;
            }
            return sliderHapticFeedback.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsStrong() {
            return this.isStrong;
        }

        public final SliderHapticFeedback copy(boolean isStrong) {
            return new SliderHapticFeedback(isStrong);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SliderHapticFeedback) && this.isStrong == ((SliderHapticFeedback) other).isStrong;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStrong);
        }

        public String toString() {
            return "SliderHapticFeedback(isStrong=" + this.isStrong + ")";
        }

        public SliderHapticFeedback(boolean z) {
            this.isStrong = z;
        }

        public final boolean isStrong() {
            return this.isStrong;
        }
    }
}
