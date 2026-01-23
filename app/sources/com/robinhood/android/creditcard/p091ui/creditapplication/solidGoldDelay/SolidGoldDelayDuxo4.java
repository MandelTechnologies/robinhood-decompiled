package com.robinhood.android.creditcard.p091ui.creditapplication.solidGoldDelay;

import com.robinhood.android.models.creditcard.api.graphql.ManageSolidGoldOfferResponse2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SolidGoldDelayDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayEvent;", "", "Error", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayEvent$Error;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface SolidGoldDelayDuxo4 {

    /* compiled from: SolidGoldDelayDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayEvent$Error;", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayEvent;", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageSolidGoldOfferError;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/ManageSolidGoldOfferError;)V", "getError", "()Lcom/robinhood/android/models/creditcard/api/graphql/ManageSolidGoldOfferError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayEvent$Error, reason: from toString */
    public static final /* data */ class Error implements SolidGoldDelayDuxo4 {
        public static final int $stable = 0;
        private final ManageSolidGoldOfferResponse2 error;

        public static /* synthetic */ Error copy$default(Error error, ManageSolidGoldOfferResponse2 manageSolidGoldOfferResponse2, int i, Object obj) {
            if ((i & 1) != 0) {
                manageSolidGoldOfferResponse2 = error.error;
            }
            return error.copy(manageSolidGoldOfferResponse2);
        }

        /* renamed from: component1, reason: from getter */
        public final ManageSolidGoldOfferResponse2 getError() {
            return this.error;
        }

        public final Error copy(ManageSolidGoldOfferResponse2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && this.error == ((Error) other).error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        public Error(ManageSolidGoldOfferResponse2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final ManageSolidGoldOfferResponse2 getError() {
            return this.error;
        }
    }
}
