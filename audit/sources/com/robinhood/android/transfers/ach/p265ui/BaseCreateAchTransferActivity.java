package com.robinhood.android.transfers.ach.p265ui;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.transfers.ach.util.TransferData;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: BaseCreateAchTransferActivity.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R7\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005`\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/BaseCreateAchTransferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "sessionId", "Ljava/util/UUID;", "getSessionId$feature_legacy_ach_transfers_externalDebug", "()Ljava/util/UUID;", "sessionId$delegate", "Lkotlin/properties/ReadWriteProperty;", "transferDataToRefId", "Ljava/util/HashMap;", "Lcom/robinhood/android/transfers/ach/util/TransferData;", "Lkotlin/collections/HashMap;", "getTransferDataToRefId", "()Ljava/util/HashMap;", "transferDataToRefId$delegate", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class BaseCreateAchTransferActivity extends BaseActivity {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseCreateAchTransferActivity.class, "sessionId", "getSessionId$feature_legacy_ach_transfers_externalDebug()Ljava/util/UUID;", 0)), Reflection.property1(new PropertyReference1Impl(BaseCreateAchTransferActivity.class, "transferDataToRefId", "getTransferDataToRefId()Ljava/util/HashMap;", 0))};
    public static final int $stable = 8;

    /* renamed from: sessionId$delegate, reason: from kotlin metadata */
    private final Interfaces3 sessionId;

    /* renamed from: transferDataToRefId$delegate, reason: from kotlin metadata */
    private final Interfaces3 transferDataToRefId;

    public abstract TransferContext getTransferContext();

    public BaseCreateAchTransferActivity() {
        super(C11048R.layout.activity_fragment_container);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this, uuidRandomUUID);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.sessionId = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[0]);
        this.transferDataToRefId = (Interfaces3) BindSavedState2.savedSerializable(this, new HashMap()).provideDelegate(this, kPropertyArr[1]);
    }

    public final UUID getSessionId$feature_legacy_ach_transfers_externalDebug() {
        Object value = this.sessionId.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }

    public final HashMap<TransferData, UUID> getTransferDataToRefId() {
        return (HashMap) this.transferDataToRefId.getValue(this, $$delegatedProperties[1]);
    }
}
