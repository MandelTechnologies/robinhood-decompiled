package com.robinhood.android.transfers.util;

import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.TransferDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToApiTransferDirection.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toTransferDirectionV2", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "Lcom/robinhood/models/db/TransferDirection;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.util.ToApiTransferDirectionKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ToApiTransferDirection {

    /* compiled from: ToApiTransferDirection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.util.ToApiTransferDirectionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TransferDirectionV2 toTransferDirectionV2(TransferDirection transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferDirection.ordinal()];
        if (i == 1) {
            return TransferDirectionV2.DEPOSIT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return TransferDirectionV2.WITHDRAW;
    }
}
