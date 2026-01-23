package com.robinhood.android.common.portfolio.unified;

import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayType.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"toDisplayType", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "toInstrumentDisplayType", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.unified.DisplayTypeKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DisplayType2 {

    /* compiled from: DisplayType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.unified.DisplayTypeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InstrumentDisplayType.values().length];
            try {
                iArr[InstrumentDisplayType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentDisplayType.LAST_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstrumentDisplayType.PERCENT_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DisplayType.values().length];
            try {
                iArr2[DisplayType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DisplayType.LAST_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DisplayType.PERCENT_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final DisplayType toDisplayType(InstrumentDisplayType instrumentDisplayType) {
        Intrinsics.checkNotNullParameter(instrumentDisplayType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[instrumentDisplayType.ordinal()];
        if (i == 1) {
            return DisplayType.UNKNOWN;
        }
        if (i == 2) {
            return DisplayType.LAST_PRICE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return DisplayType.PERCENT_CHANGE;
    }

    public static final InstrumentDisplayType toInstrumentDisplayType(DisplayType displayType) {
        Intrinsics.checkNotNullParameter(displayType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[displayType.ordinal()];
        if (i == 1) {
            return InstrumentDisplayType.UNKNOWN;
        }
        if (i == 2) {
            return InstrumentDisplayType.LAST_PRICE;
        }
        if (i == 3) {
            return InstrumentDisplayType.PERCENT_CHANGE;
        }
        return InstrumentDisplayType.LAST_PRICE;
    }
}
