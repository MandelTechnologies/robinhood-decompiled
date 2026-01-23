package com.robinhood.shared.crypto.transfer.verification.category;

import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TransferCategoryDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0017\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u001f\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/category/TransferCategoryViewState;", "", "networkLoading", "", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "<init>", "(ZLcom/robinhood/shared/crypto/transfer/verification/VerificationType;)V", "shimmer", "getShimmer", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "firstPartyText", "getFirstPartyText", "thirdPartyText", "getThirdPartyText", "loading", "getLoading", "interfaceEnabled", "getInterfaceEnabled", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TransferCategoryViewState {
    public static final int $stable = 0;
    private final boolean networkLoading;
    private final VerificationType verificationType;

    /* compiled from: TransferCategoryDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationType.values().length];
            try {
                iArr[VerificationType.WITHDRAWAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationType.DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferCategoryViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getNetworkLoading() {
        return this.networkLoading;
    }

    /* renamed from: component2, reason: from getter */
    private final VerificationType getVerificationType() {
        return this.verificationType;
    }

    public static /* synthetic */ TransferCategoryViewState copy$default(TransferCategoryViewState transferCategoryViewState, boolean z, VerificationType verificationType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = transferCategoryViewState.networkLoading;
        }
        if ((i & 2) != 0) {
            verificationType = transferCategoryViewState.verificationType;
        }
        return transferCategoryViewState.copy(z, verificationType);
    }

    public final TransferCategoryViewState copy(boolean networkLoading, VerificationType verificationType) {
        return new TransferCategoryViewState(networkLoading, verificationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferCategoryViewState)) {
            return false;
        }
        TransferCategoryViewState transferCategoryViewState = (TransferCategoryViewState) other;
        return this.networkLoading == transferCategoryViewState.networkLoading && this.verificationType == transferCategoryViewState.verificationType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.networkLoading) * 31;
        VerificationType verificationType = this.verificationType;
        return iHashCode + (verificationType == null ? 0 : verificationType.hashCode());
    }

    public String toString() {
        return "TransferCategoryViewState(networkLoading=" + this.networkLoading + ", verificationType=" + this.verificationType + ")";
    }

    public TransferCategoryViewState(boolean z, VerificationType verificationType) {
        this.networkLoading = z;
        this.verificationType = verificationType;
    }

    public /* synthetic */ TransferCategoryViewState(boolean z, VerificationType verificationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : verificationType);
    }

    public final boolean getShimmer() {
        return this.verificationType == null;
    }

    public final StringResource getTitle() {
        VerificationType verificationType = this.verificationType;
        int i = verificationType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C37934R.string.withdrawal_destination_title, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C37934R.string.deposit_destination_title, new Object[0]);
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final StringResource getFirstPartyText() {
        VerificationType verificationType = this.verificationType;
        int i = verificationType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C37934R.string.withdrawal_destination_myself, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C37934R.string.deposit_destination_myself, new Object[0]);
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final StringResource getThirdPartyText() {
        VerificationType verificationType = this.verificationType;
        int i = verificationType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C37934R.string.withdrawal_destination_someone_else, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C37934R.string.deposit_destination_someone_else, new Object[0]);
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final boolean getLoading() {
        return this.networkLoading || this.verificationType == null;
    }

    public final boolean getInterfaceEnabled() {
        return !getLoading();
    }
}
