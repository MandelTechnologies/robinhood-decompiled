package com.robinhood.rosetta.converters.security;

import com.robinhood.prefs.LockscreenTimeout;
import com.robinhood.rosetta.eventlogging.DeviceSecurityTimeout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LockscreenTimeouts.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityTimeout;", "Lcom/robinhood/prefs/LockscreenTimeout;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.security.LockscreenTimeoutsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class LockscreenTimeouts2 {

    /* compiled from: LockscreenTimeouts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.security.LockscreenTimeoutsKt$WhenMappings */
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

    public static final DeviceSecurityTimeout toProtobuf(LockscreenTimeout lockscreenTimeout) {
        Intrinsics.checkNotNullParameter(lockscreenTimeout, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[lockscreenTimeout.ordinal()]) {
            case 1:
                return DeviceSecurityTimeout.IMMEDIATELY;
            case 2:
                return DeviceSecurityTimeout.FIVE_SECONDS;
            case 3:
                return DeviceSecurityTimeout.ONE_MINUTE;
            case 4:
                return DeviceSecurityTimeout.FIVE_MINUTES;
            case 5:
                return DeviceSecurityTimeout.FIFTEEN_MINUTES;
            case 6:
                return DeviceSecurityTimeout.ONE_HOUR;
            case 7:
                return DeviceSecurityTimeout.FOUR_HOURS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
