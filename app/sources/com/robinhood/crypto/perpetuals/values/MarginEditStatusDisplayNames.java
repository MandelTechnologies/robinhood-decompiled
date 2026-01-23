package com.robinhood.crypto.perpetuals.values;

import com.robinhood.crypto.models.perpetuals.p288db.MarginEditStatus;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginEditStatusDisplayNames.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"displayName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/db/MarginEditStatus;", "getDisplayName", "(Lcom/robinhood/crypto/models/perpetuals/db/MarginEditStatus;)Lcom/robinhood/utils/resource/StringResource;", "lowercaseDisplayName", "getLowercaseDisplayName", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.values.MarginEditStatusDisplayNamesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class MarginEditStatusDisplayNames {

    /* compiled from: MarginEditStatusDisplayNames.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.values.MarginEditStatusDisplayNamesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarginEditStatus.values().length];
            try {
                iArr[MarginEditStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarginEditStatus.PARTIALLY_FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarginEditStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarginEditStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getDisplayName(MarginEditStatus marginEditStatus) {
        Intrinsics.checkNotNullParameter(marginEditStatus, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[marginEditStatus.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_status_filled, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_status_partially_filled, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_status_pending, new Object[0]);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.order_status_failed, new Object[0]);
    }

    public static final StringResource getLowercaseDisplayName(MarginEditStatus marginEditStatus) {
        Intrinsics.checkNotNullParameter(marginEditStatus, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[marginEditStatus.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_status_filled_lowercase, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_status_partially_filled_lowercase, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_status_pending_lowercase, new Object[0]);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.order_status_failed_lowercase, new Object[0]);
    }
}
