package com.robinhood.librobinhood.data.store;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: DocumentStore.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EdocsV2Params;", "", "j$/time/LocalDate", InquiryField.DateField.TYPE, "", "accountNumber", "<init>", "(Lj$/time/LocalDate;Ljava/lang/String;)V", "component1", "()Lj$/time/LocalDate;", "component2", "()Ljava/lang/String;", "copy", "(Lj$/time/LocalDate;Ljava/lang/String;)Lcom/robinhood/librobinhood/data/store/EdocsV2Params;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "getDate", "Ljava/lang/String;", "getAccountNumber", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class EdocsV2Params {
    private final String accountNumber;
    private final LocalDate date;

    public static /* synthetic */ EdocsV2Params copy$default(EdocsV2Params edocsV2Params, LocalDate localDate, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = edocsV2Params.date;
        }
        if ((i & 2) != 0) {
            str = edocsV2Params.accountNumber;
        }
        return edocsV2Params.copy(localDate, str);
    }

    /* renamed from: component1, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final EdocsV2Params copy(LocalDate date, String accountNumber) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new EdocsV2Params(date, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdocsV2Params)) {
            return false;
        }
        EdocsV2Params edocsV2Params = (EdocsV2Params) other;
        return Intrinsics.areEqual(this.date, edocsV2Params.date) && Intrinsics.areEqual(this.accountNumber, edocsV2Params.accountNumber);
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.accountNumber.hashCode();
    }

    public String toString() {
        return "EdocsV2Params(date=" + this.date + ", accountNumber=" + this.accountNumber + ")";
    }

    public EdocsV2Params(LocalDate date, String accountNumber) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.date = date;
        this.accountNumber = accountNumber;
    }

    public final LocalDate getDate() {
        return this.date;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
