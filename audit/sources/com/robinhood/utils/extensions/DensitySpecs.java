package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DensitySpecs.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"multiplierString", "", "Lcom/robinhood/utils/extensions/DensitySpec;", "getMultiplierString", "(Lcom/robinhood/utils/extensions/DensitySpec;)Ljava/lang/String;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.DensitySpecsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class DensitySpecs {

    /* compiled from: DensitySpecs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.utils.extensions.DensitySpecsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContextsUiExtensions2.values().length];
            try {
                iArr[ContextsUiExtensions2.MDPI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContextsUiExtensions2.HDPI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContextsUiExtensions2.XHDPI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContextsUiExtensions2.XXHDPI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getMultiplierString(ContextsUiExtensions2 contextsUiExtensions2) {
        Intrinsics.checkNotNullParameter(contextsUiExtensions2, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[contextsUiExtensions2.ordinal()];
        if (i == 1) {
            return "1x";
        }
        if (i == 2) {
            return "1.5x";
        }
        if (i == 3) {
            return "2x";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "3x";
    }
}
