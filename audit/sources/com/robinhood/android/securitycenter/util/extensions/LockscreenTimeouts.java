package com.robinhood.android.securitycenter.util.extensions;

import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.prefs.LockscreenTimeout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LockscreenTimeouts.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"stringRes", "", "Lcom/robinhood/prefs/LockscreenTimeout;", "getStringRes", "(Lcom/robinhood/prefs/LockscreenTimeout;)I", "feature-security-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.util.extensions.LockscreenTimeoutsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class LockscreenTimeouts {

    /* compiled from: LockscreenTimeouts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.util.extensions.LockscreenTimeoutsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LockscreenTimeout.values().length];
            try {
                iArr[LockscreenTimeout.IMMEDIATELY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LockscreenTimeout.FIVE_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LockscreenTimeout.ONE_MINUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LockscreenTimeout.FIVE_MINUTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LockscreenTimeout.FIFTEEN_MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LockscreenTimeout.ONE_HOUR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LockscreenTimeout.FOUR_HOURS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStringRes(LockscreenTimeout lockscreenTimeout) {
        Intrinsics.checkNotNullParameter(lockscreenTimeout, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[lockscreenTimeout.ordinal()]) {
            case 1:
                return C28186R.string.device_security_timeout_immediately;
            case 2:
                return C28186R.string.device_security_timeout_five_seconds;
            case 3:
                return C28186R.string.device_security_timeout_one_minute;
            case 4:
                return C28186R.string.device_security_timeout_five_minutes;
            case 5:
                return C28186R.string.device_security_timeout_fifteen_minutes;
            case 6:
                return C28186R.string.device_security_timeout_one_hour;
            case 7:
                return C28186R.string.device_security_timeout_four_hours;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
