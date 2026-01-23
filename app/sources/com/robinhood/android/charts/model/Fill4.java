package com.robinhood.android.charts.model;

import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathOperation;
import com.robinhood.models.serverdriven.experimental.api.Corner;
import com.robinhood.models.serverdriven.experimental.api.CornerRadiusInfo;
import com.robinhood.models.serverdriven.experimental.api.GradientStyle;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.CornerDto;
import rh_server_driven_ui.p531v1.CornerRadiusInfoDto;
import rh_server_driven_ui.p531v1.GradientStyleDto;

/* compiled from: Fill.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002\"!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"offsets", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Offset;", "Lcom/robinhood/models/serverdriven/experimental/api/GradientStyle;", "getOffsets", "(Lcom/robinhood/models/serverdriven/experimental/api/GradientStyle;)Lkotlin/Pair;", "Lrh_server_driven_ui/v1/GradientStyleDto;", "(Lrh_server_driven_ui/v1/GradientStyleDto;)Lkotlin/Pair;", "toPath", "Landroidx/compose/ui/graphics/Path;", "Lcom/robinhood/models/serverdriven/experimental/api/CornerRadiusInfo;", "initialPath", "radiusInPx", "", "Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.model.FillKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Fill4 {

    /* compiled from: Fill.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.charts.model.FillKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[GradientStyle.values().length];
            try {
                iArr[GradientStyle.LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientStyle.RIGHT_TO_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientStyle.TOP_TO_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientStyle.BOTTOM_TO_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientStyle.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GradientStyleDto.values().length];
            try {
                iArr2[GradientStyleDto.GRADIENT_STYLE_LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GradientStyleDto.GRADIENT_STYLE_RIGHT_TO_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[GradientStyleDto.GRADIENT_STYLE_TOP_TO_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[GradientStyleDto.GRADIENT_STYLE_BOTTOM_TO_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GradientStyleDto.GRADIENT_STYLE_UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[GradientStyleDto.GRADIENT_STYLE_UNSPECIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Corner.values().length];
            try {
                iArr3[Corner.MIN_X_MAX_Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Corner.MAX_X_MAX_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Corner.MIN_X_MIN_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Corner.MAX_X_MIN_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CornerDto.values().length];
            try {
                iArr4[CornerDto.CORNER_MIN_X_MAX_Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[CornerDto.CORNER_MAX_X_MAX_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[CornerDto.CORNER_MIN_X_MIN_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[CornerDto.CORNER_MAX_X_MIN_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[CornerDto.CORNER_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path toPath(CornerRadiusInfo cornerRadiusInfo, Path path, float f) {
        long jM6528constructorimpl = CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        CornerRadius.Companion companion = CornerRadius.INSTANCE;
        long jM6532getZerokKHJgLs = companion.m6532getZerokKHJgLs();
        long jM6532getZerokKHJgLs2 = companion.m6532getZerokKHJgLs();
        long jM6532getZerokKHJgLs3 = companion.m6532getZerokKHJgLs();
        long jM6532getZerokKHJgLs4 = companion.m6532getZerokKHJgLs();
        Iterator<Corner> it = cornerRadiusInfo.getRounded_corners().iterator();
        long j = jM6532getZerokKHJgLs;
        long j2 = jM6532getZerokKHJgLs2;
        long j3 = jM6532getZerokKHJgLs3;
        long j4 = jM6532getZerokKHJgLs4;
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$2[it.next().ordinal()];
            if (i == 1) {
                j = jM6528constructorimpl;
            } else if (i == 2) {
                j2 = jM6528constructorimpl;
            } else if (i == 3) {
                j3 = jM6528constructorimpl;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                j4 = jM6528constructorimpl;
            }
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, RoundRect2.m6570RoundRectZAM2FJo(path.getBounds(), j, j2, j4, j3), null, 2, null);
        return Path.INSTANCE.m6805combinexh6zSI8(PathOperation.INSTANCE.m6814getIntersectb3I0S0c(), path, Path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path toPath(CornerRadiusInfoDto cornerRadiusInfoDto, Path path, float f) {
        long jM6528constructorimpl = CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        CornerRadius.Companion companion = CornerRadius.INSTANCE;
        long jM6532getZerokKHJgLs = companion.m6532getZerokKHJgLs();
        long jM6532getZerokKHJgLs2 = companion.m6532getZerokKHJgLs();
        long jM6532getZerokKHJgLs3 = companion.m6532getZerokKHJgLs();
        long jM6532getZerokKHJgLs4 = companion.m6532getZerokKHJgLs();
        Iterator<CornerDto> it = cornerRadiusInfoDto.getRounded_corners().iterator();
        long j = jM6532getZerokKHJgLs;
        long j2 = jM6532getZerokKHJgLs2;
        long j3 = jM6532getZerokKHJgLs3;
        long j4 = jM6532getZerokKHJgLs4;
        while (it.hasNext()) {
            int i = WhenMappings.$EnumSwitchMapping$3[it.next().ordinal()];
            if (i == 1) {
                j = jM6528constructorimpl;
            } else if (i == 2) {
                j2 = jM6528constructorimpl;
            } else if (i == 3) {
                j3 = jM6528constructorimpl;
            } else if (i == 4) {
                j4 = jM6528constructorimpl;
            } else if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, RoundRect2.m6570RoundRectZAM2FJo(path.getBounds(), j, j2, j4, j3), null, 2, null);
        return Path.INSTANCE.m6805combinexh6zSI8(PathOperation.INSTANCE.m6814getIntersectb3I0S0c(), path, Path);
    }

    public static final Tuples2<Offset, Offset> getOffsets(GradientStyle gradientStyle) {
        Intrinsics.checkNotNullParameter(gradientStyle, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[gradientStyle.ordinal()];
        if (i == 1) {
            return new Tuples2<>(Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()), Offset.m6534boximpl(Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(0.0f)) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32))));
        }
        if (i == 2) {
            return new Tuples2<>(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32))), Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()));
        }
        if (i == 3) {
            return new Tuples2<>(Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()), Offset.m6534boximpl(Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) | (Float.floatToRawIntBits(0.0f) << 32))));
        }
        if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("not supported");
        }
        return new Tuples2<>(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()));
    }

    public static final Tuples2<Offset, Offset> getOffsets(GradientStyleDto gradientStyleDto) {
        Intrinsics.checkNotNullParameter(gradientStyleDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[gradientStyleDto.ordinal()]) {
            case 1:
                return new Tuples2<>(Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()), Offset.m6534boximpl(Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(0.0f)) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32))));
            case 2:
                return new Tuples2<>(Offset.m6534boximpl(Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(0.0f)) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32))), Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()));
            case 3:
                return new Tuples2<>(Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()), Offset.m6534boximpl(Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) | (Float.floatToRawIntBits(0.0f) << 32))));
            case 4:
                return new Tuples2<>(Offset.m6534boximpl(Offset.m6535constructorimpl((4294967295L & Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) | (Float.floatToRawIntBits(0.0f) << 32))), Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()));
            case 5:
            case 6:
                throw new IllegalStateException("not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
