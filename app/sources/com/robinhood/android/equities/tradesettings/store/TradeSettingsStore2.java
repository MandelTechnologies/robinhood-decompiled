package com.robinhood.android.equities.tradesettings.store;

import kotlin.Metadata;

/* compiled from: TradeSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;", "", "autoSend", "", "getAutoSend", "()Z", "State", "NotSignedAgreement", "ExpiredAgreement", "AutosendIsOnAgreementNotSigned", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState$AutosendIsOnAgreementNotSigned;", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState$ExpiredAgreement;", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState$NotSignedAgreement;", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState$State;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.tradesettings.store.AutoSendState, reason: use source file name */
/* loaded from: classes3.dex */
public interface TradeSettingsStore2 {
    boolean getAutoSend();

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/AutoSendState$State;", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;", "autoSend", "", "<init>", "(Z)V", "getAutoSend", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.tradesettings.store.AutoSendState$State, reason: from toString */
    public static final /* data */ class State implements TradeSettingsStore2 {
        public static final int $stable = 0;
        private final boolean autoSend;

        public static /* synthetic */ State copy$default(State state, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = state.autoSend;
            }
            return state.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAutoSend() {
            return this.autoSend;
        }

        public final State copy(boolean autoSend) {
            return new State(autoSend);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof State) && this.autoSend == ((State) other).autoSend;
        }

        public int hashCode() {
            return Boolean.hashCode(this.autoSend);
        }

        public String toString() {
            return "State(autoSend=" + this.autoSend + ")";
        }

        public State(boolean z) {
            this.autoSend = z;
        }

        @Override // com.robinhood.android.equities.tradesettings.store.TradeSettingsStore2
        public boolean getAutoSend() {
            return this.autoSend;
        }
    }

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/AutoSendState$NotSignedAgreement;", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;", "<init>", "()V", "autoSend", "", "getAutoSend", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.tradesettings.store.AutoSendState$NotSignedAgreement */
    public static final /* data */ class NotSignedAgreement implements TradeSettingsStore2 {
        public static final int $stable = 0;
        public static final NotSignedAgreement INSTANCE = new NotSignedAgreement();
        private static final boolean autoSend = false;

        public boolean equals(Object other) {
            return this == other || (other instanceof NotSignedAgreement);
        }

        public int hashCode() {
            return 433848698;
        }

        public String toString() {
            return "NotSignedAgreement";
        }

        private NotSignedAgreement() {
        }

        @Override // com.robinhood.android.equities.tradesettings.store.TradeSettingsStore2
        public boolean getAutoSend() {
            return autoSend;
        }
    }

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/AutoSendState$ExpiredAgreement;", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;", "<init>", "()V", "autoSend", "", "getAutoSend", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.tradesettings.store.AutoSendState$ExpiredAgreement */
    public static final /* data */ class ExpiredAgreement implements TradeSettingsStore2 {
        public static final int $stable = 0;
        public static final ExpiredAgreement INSTANCE = new ExpiredAgreement();
        private static final boolean autoSend = false;

        public boolean equals(Object other) {
            return this == other || (other instanceof ExpiredAgreement);
        }

        public int hashCode() {
            return -1663194460;
        }

        public String toString() {
            return "ExpiredAgreement";
        }

        private ExpiredAgreement() {
        }

        @Override // com.robinhood.android.equities.tradesettings.store.TradeSettingsStore2
        public boolean getAutoSend() {
            return autoSend;
        }
    }

    /* compiled from: TradeSettingsStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/store/AutoSendState$AutosendIsOnAgreementNotSigned;", "Lcom/robinhood/android/equities/tradesettings/store/AutoSendState;", "<init>", "()V", "autoSend", "", "getAutoSend", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.tradesettings.store.AutoSendState$AutosendIsOnAgreementNotSigned */
    public static final /* data */ class AutosendIsOnAgreementNotSigned implements TradeSettingsStore2 {
        public static final int $stable = 0;
        public static final AutosendIsOnAgreementNotSigned INSTANCE = new AutosendIsOnAgreementNotSigned();
        private static final boolean autoSend = true;

        public boolean equals(Object other) {
            return this == other || (other instanceof AutosendIsOnAgreementNotSigned);
        }

        public int hashCode() {
            return 259690500;
        }

        public String toString() {
            return "AutosendIsOnAgreementNotSigned";
        }

        private AutosendIsOnAgreementNotSigned() {
        }

        @Override // com.robinhood.android.equities.tradesettings.store.TradeSettingsStore2
        public boolean getAutoSend() {
            return autoSend;
        }
    }
}
