package com.robinhood.transfers.suggestions.pills.contracts;

import com.robinhood.android.common.util.TransitionReason;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MicrogramTransferAccountStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountStatus;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "APPROVED", "NEEDS_APPROVAL", "VERIFIED", "NEEDS_VERIFICATION", "PENDING", "UNKNOWN", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final class MicrogramTransferAccountStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MicrogramTransferAccountStatus[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;

    @SerialName("approved")
    public static final MicrogramTransferAccountStatus APPROVED = new MicrogramTransferAccountStatus("APPROVED", 0, "approved");

    @SerialName("needs_approval")
    public static final MicrogramTransferAccountStatus NEEDS_APPROVAL = new MicrogramTransferAccountStatus("NEEDS_APPROVAL", 1, "needs_approval");

    @SerialName(TransitionReason.MICRODEPOSIT_VERIFIED)
    public static final MicrogramTransferAccountStatus VERIFIED = new MicrogramTransferAccountStatus("VERIFIED", 2, TransitionReason.MICRODEPOSIT_VERIFIED);

    @SerialName("needs_verification")
    public static final MicrogramTransferAccountStatus NEEDS_VERIFICATION = new MicrogramTransferAccountStatus("NEEDS_VERIFICATION", 3, "needs_verification");

    @SerialName("pending")
    public static final MicrogramTransferAccountStatus PENDING = new MicrogramTransferAccountStatus("PENDING", 4, "pending");

    @SerialName("unknown")
    public static final MicrogramTransferAccountStatus UNKNOWN = new MicrogramTransferAccountStatus("UNKNOWN", 5, "unknown");

    private static final /* synthetic */ MicrogramTransferAccountStatus[] $values() {
        return new MicrogramTransferAccountStatus[]{APPROVED, NEEDS_APPROVAL, VERIFIED, NEEDS_VERIFICATION, PENDING, UNKNOWN};
    }

    public static EnumEntries<MicrogramTransferAccountStatus> getEntries() {
        return $ENTRIES;
    }

    public static MicrogramTransferAccountStatus valueOf(String str) {
        return (MicrogramTransferAccountStatus) Enum.valueOf(MicrogramTransferAccountStatus.class, str);
    }

    public static MicrogramTransferAccountStatus[] values() {
        return (MicrogramTransferAccountStatus[]) $VALUES.clone();
    }

    private MicrogramTransferAccountStatus(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        MicrogramTransferAccountStatus[] microgramTransferAccountStatusArr$values = $values();
        $VALUES = microgramTransferAccountStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(microgramTransferAccountStatusArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccountStatus.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccountStatus", MicrogramTransferAccountStatus.values(), new String[]{"approved", "needs_approval", TransitionReason.MICRODEPOSIT_VERIFIED, "needs_verification", "pending", "unknown"}, new Annotation[][]{null, null, null, null, null, null}, null);
            }
        });
    }

    /* compiled from: MicrogramTransferAccountStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountStatus$Companion;", "", "()V", "fromServerValue", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountStatus;", "serverValue", "", "serializer", "Lkotlinx/serialization/KSerializer;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MicrogramTransferAccountStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<MicrogramTransferAccountStatus> serializer() {
            return get$cachedSerializer();
        }

        public final MicrogramTransferAccountStatus fromServerValue(String serverValue) {
            MicrogramTransferAccountStatus next;
            Intrinsics.checkNotNullParameter(serverValue, "serverValue");
            Iterator<MicrogramTransferAccountStatus> it = MicrogramTransferAccountStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getServerValue(), serverValue)) {
                    break;
                }
            }
            return next;
        }
    }
}
