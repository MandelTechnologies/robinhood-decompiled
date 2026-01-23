package microgram.service.protocol;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import microgram.MicrogramError;

/* compiled from: ProtocolExceptions.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005*\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"asMicrogramError", "Lmicrogram/MicrogramError;", "", "asException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "microgram-service"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.service.protocol.ProtocolExceptionsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ProtocolExceptions5 {

    /* compiled from: ProtocolExceptions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.service.protocol.ProtocolExceptionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MicrogramError.values().length];
            try {
                iArr[MicrogramError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MicrogramError.APPLICATION_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MicrogramError.WIRE_COMMUNICATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MicrogramError.UNKNOWN_TARGET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MicrogramError.UNSUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MicrogramError.INTERRUPTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MicrogramError asMicrogramError(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof CancellationException) {
            return MicrogramError.INTERRUPTED;
        }
        if ((th instanceof UnsupportedOperationException) || (th instanceof ProtocolExceptions8)) {
            return MicrogramError.UNSUPPORTED;
        }
        return th instanceof ProtocolExceptions7 ? MicrogramError.UNKNOWN_TARGET : th instanceof ProtocolExceptions ? MicrogramError.APPLICATION_ERROR : th instanceof ProtocolExceptions2 ? MicrogramError.INTERNAL_ERROR : th instanceof IOException ? MicrogramError.WIRE_COMMUNICATION_ERROR : th instanceof Exception ? MicrogramError.APPLICATION_ERROR : MicrogramError.INTERNAL_ERROR;
    }

    public static final Exception asException(MicrogramError microgramError, String str) {
        Intrinsics.checkNotNullParameter(microgramError, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[microgramError.ordinal()]) {
            case 1:
                return new ProtocolExceptions2("Internal Error: " + str);
            case 2:
                return new ProtocolExceptions(str);
            case 3:
                return new ProtocolExceptions4(str, null, 2, null);
            case 4:
                return new ProtocolExceptions7("It looks like your service isn't declared in your info.json. " + str);
            case 5:
                return new ProtocolExceptions8(str, null, 2, null);
            case 6:
                return new ProtocolExceptions3(str);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
