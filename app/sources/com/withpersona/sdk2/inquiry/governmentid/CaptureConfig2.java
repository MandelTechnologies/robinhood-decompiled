package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CaptureConfig.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u0002\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m3636d2 = {"getSideConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "side", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "idClassKey", "", "getIdClassKey", "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "getIdClass", "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "getIdConfigOrNull", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.CaptureConfigKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class CaptureConfig2 {
    public static final IdConfig.IdSideConfig getSideConfig(CaptureConfig captureConfig, IdConfig.Side side) {
        Intrinsics.checkNotNullParameter(captureConfig, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return ((CaptureConfig.AutoClassifyConfig) captureConfig).getConfig().getIdSideConfig();
        }
        if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((CaptureConfig.IdCaptureConfig) captureConfig).getId().getSideConfig(side);
    }

    public static final String getIdClassKey(CaptureConfig captureConfig) {
        Intrinsics.checkNotNullParameter(captureConfig, "<this>");
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return IdClass.KeyAutoClassification;
        }
        if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((CaptureConfig.IdCaptureConfig) captureConfig).getId().getIdClassKey();
    }

    public static final IdClass getIdClass(CaptureConfig captureConfig) {
        Intrinsics.checkNotNullParameter(captureConfig, "<this>");
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return IdClass.Unknown;
        }
        if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((CaptureConfig.IdCaptureConfig) captureConfig).getId().getType();
    }

    public static final IdConfig getIdConfigOrNull(CaptureConfig captureConfig) {
        Intrinsics.checkNotNullParameter(captureConfig, "<this>");
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return null;
        }
        if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((CaptureConfig.IdCaptureConfig) captureConfig).getId();
    }
}
