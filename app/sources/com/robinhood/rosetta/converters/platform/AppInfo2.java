package com.robinhood.rosetta.converters.platform;

import com.robinhood.rosetta.eventlogging.Application;
import com.robinhood.utils.buildconfig.BuildVariant;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppInfo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/Application$ReleaseChannel;", "Lcom/robinhood/utils/buildconfig/BuildVariant;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.platform.AppInfoKt, reason: use source file name */
/* loaded from: classes19.dex */
public final class AppInfo2 {

    /* compiled from: AppInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.platform.AppInfoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BuildVariant.values().length];
            try {
                iArr[BuildVariant.EXTERNAL_RELEASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuildVariant.INTERNAL_RELEASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BuildVariant.EXTERNAL_DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BuildVariant.INTERNAL_DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Application.ReleaseChannel toProtobuf(BuildVariant buildVariant) {
        Intrinsics.checkNotNullParameter(buildVariant, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[buildVariant.ordinal()];
        if (i == 1) {
            return Application.ReleaseChannel.PRODUCTION;
        }
        if (i == 2) {
            return Application.ReleaseChannel.NIGHTLY;
        }
        if (i == 3 || i == 4) {
            return Application.ReleaseChannel.LOCAL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
