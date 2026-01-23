package com.robinhood.android.equities.equitytrade;

import com.robinhood.models.p320db.ClientComponentAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderStatusAlert.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderStatusAlert;", "", "PdtSnackbar", "PdtAlert", "Lcom/robinhood/android/equities/equitytrade/OrderStatusAlert$PdtAlert;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusAlert$PdtSnackbar;", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface OrderStatusAlert {

    /* compiled from: OrderStatusAlert.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderStatusAlert$PdtSnackbar;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusAlert;", "pdt", "Lcom/robinhood/models/db/ClientComponentAlert;", "<init>", "(Lcom/robinhood/models/db/ClientComponentAlert;)V", "getPdt", "()Lcom/robinhood/models/db/ClientComponentAlert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PdtSnackbar implements OrderStatusAlert {
        private final ClientComponentAlert pdt;

        public static /* synthetic */ PdtSnackbar copy$default(PdtSnackbar pdtSnackbar, ClientComponentAlert clientComponentAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                clientComponentAlert = pdtSnackbar.pdt;
            }
            return pdtSnackbar.copy(clientComponentAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final ClientComponentAlert getPdt() {
            return this.pdt;
        }

        public final PdtSnackbar copy(ClientComponentAlert pdt) {
            Intrinsics.checkNotNullParameter(pdt, "pdt");
            return new PdtSnackbar(pdt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PdtSnackbar) && Intrinsics.areEqual(this.pdt, ((PdtSnackbar) other).pdt);
        }

        public int hashCode() {
            return this.pdt.hashCode();
        }

        public String toString() {
            return "PdtSnackbar(pdt=" + this.pdt + ")";
        }

        public PdtSnackbar(ClientComponentAlert pdt) {
            Intrinsics.checkNotNullParameter(pdt, "pdt");
            this.pdt = pdt;
        }

        public final ClientComponentAlert getPdt() {
            return this.pdt;
        }
    }

    /* compiled from: OrderStatusAlert.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderStatusAlert$PdtAlert;", "Lcom/robinhood/android/equities/equitytrade/OrderStatusAlert;", "pdt", "Lcom/robinhood/models/db/ClientComponentAlert;", "<init>", "(Lcom/robinhood/models/db/ClientComponentAlert;)V", "getPdt", "()Lcom/robinhood/models/db/ClientComponentAlert;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PdtAlert implements OrderStatusAlert {
        private final ClientComponentAlert pdt;

        public static /* synthetic */ PdtAlert copy$default(PdtAlert pdtAlert, ClientComponentAlert clientComponentAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                clientComponentAlert = pdtAlert.pdt;
            }
            return pdtAlert.copy(clientComponentAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final ClientComponentAlert getPdt() {
            return this.pdt;
        }

        public final PdtAlert copy(ClientComponentAlert pdt) {
            Intrinsics.checkNotNullParameter(pdt, "pdt");
            return new PdtAlert(pdt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PdtAlert) && Intrinsics.areEqual(this.pdt, ((PdtAlert) other).pdt);
        }

        public int hashCode() {
            return this.pdt.hashCode();
        }

        public String toString() {
            return "PdtAlert(pdt=" + this.pdt + ")";
        }

        public PdtAlert(ClientComponentAlert pdt) {
            Intrinsics.checkNotNullParameter(pdt, "pdt");
            this.pdt = pdt;
        }

        public final ClientComponentAlert getPdt() {
            return this.pdt;
        }
    }
}
