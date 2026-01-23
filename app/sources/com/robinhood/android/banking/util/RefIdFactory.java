package com.robinhood.android.banking.util;

import androidx.lifecycle.SavedStateHandle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RefIdFactory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/banking/util/RefIdFactory;", "TRANSFERDATA", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "transferDataToRefId", "", "", "Ljava/util/UUID;", "getTransferDataToRefId", "()Ljava/util/Map;", "transferDataToRefId$delegate", "Lkotlin/Lazy;", "generateRefId", "transferData", "(Ljava/lang/Object;)Ljava/util/UUID;", "invalidateTransfer", "", "(Ljava/lang/Object;)V", "Companion", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RefIdFactory<TRANSFERDATA> {
    public static final String TransferDataToRefIdKey = "TransferDataToRefId";
    private final SavedStateHandle savedStateHandle;

    /* renamed from: transferDataToRefId$delegate, reason: from kotlin metadata */
    private final Lazy transferDataToRefId;

    public RefIdFactory(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.transferDataToRefId = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.banking.util.RefIdFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RefIdFactory.transferDataToRefId_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final Map<Integer, UUID> getTransferDataToRefId() {
        return (Map) this.transferDataToRefId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map transferDataToRefId_delegate$lambda$0(RefIdFactory refIdFactory) {
        Map map = (Map) refIdFactory.savedStateHandle.get(TransferDataToRefIdKey);
        return map == null ? new LinkedHashMap() : map;
    }

    public final UUID generateRefId(TRANSFERDATA transferData) {
        int iHashCode = transferData != null ? transferData.hashCode() : 0;
        UUID uuid = getTransferDataToRefId().get(Integer.valueOf(iHashCode));
        if (uuid != null) {
            return uuid;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        getTransferDataToRefId().put(Integer.valueOf(iHashCode), uuidRandomUUID);
        this.savedStateHandle.set(TransferDataToRefIdKey, getTransferDataToRefId());
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "also(...)");
        return uuidRandomUUID;
    }

    public final void invalidateTransfer(TRANSFERDATA transferData) {
        getTransferDataToRefId().remove(Integer.valueOf(transferData != null ? transferData.hashCode() : 0));
        this.savedStateHandle.set(TransferDataToRefIdKey, getTransferDataToRefId());
    }
}
