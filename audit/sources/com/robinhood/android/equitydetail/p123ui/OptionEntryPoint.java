package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.models.api.bonfire.ApiStockDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/OptionEntryPoint;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "", "getHeaderData", "()Ljava/lang/Void;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OptionEntryPoint extends DetailData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final Void headerData;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ OptionEntryPoint copy$default(OptionEntryPoint optionEntryPoint, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionEntryPoint.accountNumber;
        }
        return optionEntryPoint.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final OptionEntryPoint copy(String accountNumber) {
        return new OptionEntryPoint(accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionEntryPoint) && Intrinsics.areEqual(this.accountNumber, ((OptionEntryPoint) other).accountNumber);
    }

    public int hashCode() {
        String str = this.accountNumber;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "OptionEntryPoint(accountNumber=" + this.accountNumber + ")";
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public /* bridge */ /* synthetic */ DetailData getHeaderData() {
        return (DetailData) getHeaderData();
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public OptionEntryPoint(String str) {
        super(null);
        this.accountNumber = str;
        this.section = ApiStockDetail.Section.OPTIONS;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    public Void getHeaderData() {
        return this.headerData;
    }
}
