package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.camera.GovernmentIdFeed5;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Metadata;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toParsedIdSideOrNone", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CameraScreenRunnerKt {

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdConfig.Side.values().length];
            try {
                iArr[IdConfig.Side.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.Side.FrontOrBack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GovernmentIdFeed5.Side toParsedIdSideOrNone(IdConfig.Side side) {
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return GovernmentIdFeed5.Side.Front;
        }
        if (i == 2) {
            return GovernmentIdFeed5.Side.Front;
        }
        return GovernmentIdFeed5.Side.Back;
    }
}
