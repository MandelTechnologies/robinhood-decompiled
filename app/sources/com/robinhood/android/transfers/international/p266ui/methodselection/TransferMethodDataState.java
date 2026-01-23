package com.robinhood.android.transfers.international.p266ui.methodselection;

import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import com.robinhood.android.transfers.international.p266ui.methodselection.TransferMethodFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferMethodDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodDataState;", "", "args", "Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;", "outgoingWireServiceFeeResponse", "Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;Lbff_money_movement/service/v1/GetServiceFeeResponseDto;)V", "getArgs", "()Lcom/robinhood/android/transfers/international/ui/methodselection/TransferMethodFragment$Args;", "getOutgoingWireServiceFeeResponse", "()Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferMethodDataState {
    public static final int $stable = 8;
    private final TransferMethodFragment.Args args;
    private final GetServiceFeeResponseDto outgoingWireServiceFeeResponse;

    public static /* synthetic */ TransferMethodDataState copy$default(TransferMethodDataState transferMethodDataState, TransferMethodFragment.Args args, GetServiceFeeResponseDto getServiceFeeResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            args = transferMethodDataState.args;
        }
        if ((i & 2) != 0) {
            getServiceFeeResponseDto = transferMethodDataState.outgoingWireServiceFeeResponse;
        }
        return transferMethodDataState.copy(args, getServiceFeeResponseDto);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferMethodFragment.Args getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    public final GetServiceFeeResponseDto getOutgoingWireServiceFeeResponse() {
        return this.outgoingWireServiceFeeResponse;
    }

    public final TransferMethodDataState copy(TransferMethodFragment.Args args, GetServiceFeeResponseDto outgoingWireServiceFeeResponse) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new TransferMethodDataState(args, outgoingWireServiceFeeResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferMethodDataState)) {
            return false;
        }
        TransferMethodDataState transferMethodDataState = (TransferMethodDataState) other;
        return Intrinsics.areEqual(this.args, transferMethodDataState.args) && Intrinsics.areEqual(this.outgoingWireServiceFeeResponse, transferMethodDataState.outgoingWireServiceFeeResponse);
    }

    public int hashCode() {
        int iHashCode = this.args.hashCode() * 31;
        GetServiceFeeResponseDto getServiceFeeResponseDto = this.outgoingWireServiceFeeResponse;
        return iHashCode + (getServiceFeeResponseDto == null ? 0 : getServiceFeeResponseDto.hashCode());
    }

    public String toString() {
        return "TransferMethodDataState(args=" + this.args + ", outgoingWireServiceFeeResponse=" + this.outgoingWireServiceFeeResponse + ")";
    }

    public TransferMethodDataState(TransferMethodFragment.Args args, GetServiceFeeResponseDto getServiceFeeResponseDto) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.args = args;
        this.outgoingWireServiceFeeResponse = getServiceFeeResponseDto;
    }

    public /* synthetic */ TransferMethodDataState(TransferMethodFragment.Args args, GetServiceFeeResponseDto getServiceFeeResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(args, (i & 2) != 0 ? null : getServiceFeeResponseDto);
    }

    public final TransferMethodFragment.Args getArgs() {
        return this.args;
    }

    public final GetServiceFeeResponseDto getOutgoingWireServiceFeeResponse() {
        return this.outgoingWireServiceFeeResponse;
    }
}
