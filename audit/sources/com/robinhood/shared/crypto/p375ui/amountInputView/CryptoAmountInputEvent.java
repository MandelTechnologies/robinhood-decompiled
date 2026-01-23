package com.robinhood.shared.crypto.p375ui.amountInputView;

import kotlin.Metadata;

/* compiled from: CryptoAmountInputEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "", "ModeChangedEvent", "ShakeInputEvent", "ForceRedrawEvent", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent$ForceRedrawEvent;", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent$ModeChangedEvent;", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent$ShakeInputEvent;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CryptoAmountInputEvent {

    /* compiled from: CryptoAmountInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent$ModeChangedEvent;", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ModeChangedEvent implements CryptoAmountInputEvent {
        public static final int $stable = 0;
        public static final ModeChangedEvent INSTANCE = new ModeChangedEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof ModeChangedEvent);
        }

        public int hashCode() {
            return 1192282390;
        }

        public String toString() {
            return "ModeChangedEvent";
        }

        private ModeChangedEvent() {
        }
    }

    /* compiled from: CryptoAmountInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent$ShakeInputEvent;", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShakeInputEvent implements CryptoAmountInputEvent {
        public static final int $stable = 0;
        public static final ShakeInputEvent INSTANCE = new ShakeInputEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShakeInputEvent);
        }

        public int hashCode() {
            return -1220573335;
        }

        public String toString() {
            return "ShakeInputEvent";
        }

        private ShakeInputEvent() {
        }
    }

    /* compiled from: CryptoAmountInputEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent$ForceRedrawEvent;", "Lcom/robinhood/shared/crypto/ui/amountInputView/CryptoAmountInputEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ForceRedrawEvent implements CryptoAmountInputEvent {
        public static final int $stable = 0;
        public static final ForceRedrawEvent INSTANCE = new ForceRedrawEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof ForceRedrawEvent);
        }

        public int hashCode() {
            return -1659318651;
        }

        public String toString() {
            return "ForceRedrawEvent";
        }

        private ForceRedrawEvent() {
        }
    }
}
