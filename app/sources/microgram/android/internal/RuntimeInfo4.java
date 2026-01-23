package microgram.android.internal;

import com.robinhood.targetbackend.TargetBackend;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import microgram.RuntimeInfo;

/* compiled from: RuntimeInfo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"apiEnvironment", "Lmicrogram/RuntimeInfo$ApiEnvironment;", "Lcom/robinhood/targetbackend/TargetBackend$Id;", "getApiEnvironment", "(Lcom/robinhood/targetbackend/TargetBackend$Id;)Lmicrogram/RuntimeInfo$ApiEnvironment;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.RuntimeInfoKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class RuntimeInfo4 {

    /* compiled from: RuntimeInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.internal.RuntimeInfoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TargetBackend.EnumC41639Id.values().length];
            try {
                iArr[TargetBackend.EnumC41639Id.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.STAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.EXTERNAL_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.EXTERNAL_DEGRADED_TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.CUSTOM_HOSTNAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.NAMESPACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.UAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final RuntimeInfo.ApiEnvironment getApiEnvironment(TargetBackend.EnumC41639Id enumC41639Id) {
        Intrinsics.checkNotNullParameter(enumC41639Id, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[enumC41639Id.ordinal()]) {
            case 1:
                return RuntimeInfo.ApiEnvironment.PRODUCTION;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return RuntimeInfo.ApiEnvironment.APOLLO;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
