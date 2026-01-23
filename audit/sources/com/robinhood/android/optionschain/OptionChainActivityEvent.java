package com.robinhood.android.optionschain;

import kotlin.Metadata;

/* compiled from: OptionChainActivityEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainActivityEvent;", "", "ShowCar", "Lcom/robinhood/android/optionschain/OptionChainActivityEvent$ShowCar;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface OptionChainActivityEvent {

    /* compiled from: OptionChainActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainActivityEvent$ShowCar;", "Lcom/robinhood/android/optionschain/OptionChainActivityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowCar implements OptionChainActivityEvent {
        public static final int $stable = 0;
        public static final ShowCar INSTANCE = new ShowCar();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowCar);
        }

        public int hashCode() {
            return -2106164385;
        }

        public String toString() {
            return "ShowCar";
        }

        private ShowCar() {
        }
    }
}
