package com.robinhood.android.transfers.util;

import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Selections.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/MAXTransferAccountSelectionContext$MAXTransferAccountSelectionState;", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.util.SelectionsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Selections2 {

    /* compiled from: Selections.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.util.SelectionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState toProtobuf(TransferAccountDirection transferAccountDirection) {
        Intrinsics.checkNotNullParameter(transferAccountDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferAccountDirection.ordinal()];
        if (i == 1) {
            return MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.SOURCE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return MAXTransferAccountSelectionContext.MAXTransferAccountSelectionState.SINK;
    }
}
