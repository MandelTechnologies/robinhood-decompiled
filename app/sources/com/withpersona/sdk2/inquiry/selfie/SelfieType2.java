package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfieType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"to", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "selfie_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieTypeKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class SelfieType2 {

    /* compiled from: SelfieType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieTypeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: to */
    public static final SelfieType m3253to(NextStep.Selfie.CaptureMethod captureMethod) {
        Intrinsics.checkNotNullParameter(captureMethod, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[captureMethod.ordinal()];
        if (i == 1) {
            return SelfieType.CenterOnly.INSTANCE;
        }
        if (i == 2) {
            return SelfieType.ThreePhotos.INSTANCE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SelfieType.ConfigurablePoses.INSTANCE;
    }
}
