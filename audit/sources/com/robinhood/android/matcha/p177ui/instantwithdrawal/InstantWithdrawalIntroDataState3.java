package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import com.robinhood.android.models.matcha.api.ApiMatchaTreatment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantWithdrawalIntroDataState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"contentType", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/ContentType;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTreatment$InstantWithdrawalVariant;", "getContentType", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaTreatment$InstantWithdrawalVariant;)Lcom/robinhood/android/matcha/ui/instantwithdrawal/ContentType;", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroDataStateKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class InstantWithdrawalIntroDataState3 {

    /* compiled from: InstantWithdrawalIntroDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroDataStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiMatchaTreatment.InstantWithdrawalVariant.values().length];
            try {
                iArr[ApiMatchaTreatment.InstantWithdrawalVariant.CHEAPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiMatchaTreatment.InstantWithdrawalVariant.FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiMatchaTreatment.InstantWithdrawalVariant.PAID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiMatchaTreatment.InstantWithdrawalVariant.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final InstantWithdrawalIntroDataState2 getContentType(ApiMatchaTreatment.InstantWithdrawalVariant instantWithdrawalVariant) {
        Intrinsics.checkNotNullParameter(instantWithdrawalVariant, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[instantWithdrawalVariant.ordinal()];
        if (i == 1) {
            return InstantWithdrawalIntroDataState2.CHEAPER;
        }
        if (i == 2) {
            return InstantWithdrawalIntroDataState2.FREE;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Unexpected variant " + instantWithdrawalVariant).toString());
    }
}
