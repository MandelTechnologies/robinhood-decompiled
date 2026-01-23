package com.robinhood.android.lib.screener;

import androidx.compose.p011ui.Alignment;
import com.robinhood.equityscreener.models.api.ColumnAlignment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.TableColumnAlignmentDto;

/* compiled from: ColumnAlignment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toColumnAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Lcom/robinhood/equityscreener/models/api/ColumnAlignment;", "toBoxAlignment", "Landroidx/compose/ui/Alignment;", "Lrh_server_driven_ui/v1/TableColumnAlignmentDto;", "feature-lib-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.screener.ColumnAlignmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ColumnAlignment2 {

    /* compiled from: ColumnAlignment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.screener.ColumnAlignmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ColumnAlignment.values().length];
            try {
                iArr[ColumnAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColumnAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColumnAlignment.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TableColumnAlignmentDto.values().length];
            try {
                iArr2[TableColumnAlignmentDto.LEFT_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TableColumnAlignmentDto.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TableColumnAlignmentDto.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Alignment.Horizontal toColumnAlignment(ColumnAlignment columnAlignment) {
        Intrinsics.checkNotNullParameter(columnAlignment, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[columnAlignment.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getStart();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenterHorizontally();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Alignment.INSTANCE.getEnd();
    }

    public static final Alignment toBoxAlignment(ColumnAlignment columnAlignment) {
        Intrinsics.checkNotNullParameter(columnAlignment, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[columnAlignment.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getCenterStart();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenter();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Alignment.INSTANCE.getCenterEnd();
    }

    public static final Alignment.Horizontal toColumnAlignment(TableColumnAlignmentDto tableColumnAlignmentDto) {
        Intrinsics.checkNotNullParameter(tableColumnAlignmentDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[tableColumnAlignmentDto.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getStart();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenterHorizontally();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Alignment.INSTANCE.getEnd();
    }

    public static final Alignment toBoxAlignment(TableColumnAlignmentDto tableColumnAlignmentDto) {
        Intrinsics.checkNotNullParameter(tableColumnAlignmentDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[tableColumnAlignmentDto.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getCenterStart();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenter();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Alignment.INSTANCE.getCenterEnd();
    }
}
