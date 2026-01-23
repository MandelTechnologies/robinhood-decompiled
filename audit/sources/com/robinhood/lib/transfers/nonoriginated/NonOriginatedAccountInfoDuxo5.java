package com.robinhood.lib.transfers.nonoriginated;

import bff_money_movement.service.p019v1.StandardScreenDataDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedAccountInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoEvent;", "", "<init>", "()V", "Exit", "ShowConfirmation", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoEvent$Exit;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoEvent$ShowConfirmation;", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoEvent, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class NonOriginatedAccountInfoDuxo5 {
    public static final int $stable = 0;

    public /* synthetic */ NonOriginatedAccountInfoDuxo5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: NonOriginatedAccountInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoEvent$Exit;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoEvent$Exit */
    public static final /* data */ class Exit extends NonOriginatedAccountInfoDuxo5 {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        public boolean equals(Object other) {
            return this == other || (other instanceof Exit);
        }

        public int hashCode() {
            return -1341042635;
        }

        public String toString() {
            return "Exit";
        }

        private Exit() {
            super(null);
        }
    }

    private NonOriginatedAccountInfoDuxo5() {
    }

    /* compiled from: NonOriginatedAccountInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoEvent$ShowConfirmation;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoEvent;", "screenData", "Lbff_money_movement/service/v1/StandardScreenDataDto;", "<init>", "(Lbff_money_movement/service/v1/StandardScreenDataDto;)V", "getScreenData", "()Lbff_money_movement/service/v1/StandardScreenDataDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoEvent$ShowConfirmation, reason: from toString */
    public static final /* data */ class ShowConfirmation extends NonOriginatedAccountInfoDuxo5 {
        public static final int $stable = 8;
        private final StandardScreenDataDto screenData;

        public static /* synthetic */ ShowConfirmation copy$default(ShowConfirmation showConfirmation, StandardScreenDataDto standardScreenDataDto, int i, Object obj) {
            if ((i & 1) != 0) {
                standardScreenDataDto = showConfirmation.screenData;
            }
            return showConfirmation.copy(standardScreenDataDto);
        }

        /* renamed from: component1, reason: from getter */
        public final StandardScreenDataDto getScreenData() {
            return this.screenData;
        }

        public final ShowConfirmation copy(StandardScreenDataDto screenData) {
            Intrinsics.checkNotNullParameter(screenData, "screenData");
            return new ShowConfirmation(screenData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowConfirmation) && Intrinsics.areEqual(this.screenData, ((ShowConfirmation) other).screenData);
        }

        public int hashCode() {
            return this.screenData.hashCode();
        }

        public String toString() {
            return "ShowConfirmation(screenData=" + this.screenData + ")";
        }

        public final StandardScreenDataDto getScreenData() {
            return this.screenData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowConfirmation(StandardScreenDataDto screenData) {
            super(null);
            Intrinsics.checkNotNullParameter(screenData, "screenData");
            this.screenData = screenData;
        }
    }
}
