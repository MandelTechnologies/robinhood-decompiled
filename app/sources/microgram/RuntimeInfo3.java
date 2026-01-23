package microgram;

import com.singular.sdk.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import microgram.RuntimeInfo;

/* compiled from: RuntimeInfo.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, m3636d2 = {"getGlobalRuntimeInfo", "Lmicrogram/RuntimeInfo;", "microgram-core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.RuntimeInfoKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class RuntimeInfo3 {
    public static final RuntimeInfo getGlobalRuntimeInfo() {
        return new RuntimeInfo(RuntimeInfo.Platform.ANDROID, "1.0.0", Constants.SdidMigrationStatusCodes.ALREADY_SDID, RuntimeInfo.ApiEnvironment.PRODUCTION, (String) null, RuntimeInfo.ReleaseVariant.DEVELOPMENT, RuntimeInfo.AppType.TRADER, (List) null, (String) null, false, 896, (DefaultConstructorMarker) null);
    }
}
