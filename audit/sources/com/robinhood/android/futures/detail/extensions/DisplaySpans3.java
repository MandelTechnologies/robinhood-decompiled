package com.robinhood.android.futures.detail.extensions;

import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplaySpans.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m3636d2 = {"toDescriptionStrId", "", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.extensions.DisplaySpansKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class DisplaySpans3 {

    /* compiled from: DisplaySpans.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.extensions.DisplaySpansKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisplaySpan.values().length];
            try {
                iArr[DisplaySpan.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpan.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpan.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpan.f93673MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplaySpan.YTD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DisplaySpan.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DisplaySpan.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DisplaySpan.HOUR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DisplaySpan.f93684HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DisplaySpan.f93695YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DisplaySpan.CORTEX_INSIGHTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DisplaySpan.ALL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toDescriptionStrId(DisplaySpan displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()]) {
            case 1:
                return C17042R.string.chart_span_summary_d;
            case 2:
                return C17042R.string.chart_span_summary_w;
            case 3:
                return C17042R.string.chart_span_summary_m;
            case 4:
                return C17042R.string.chart_span_summary_3m;
            case 5:
                return C17042R.string.chart_span_summary_ytd;
            case 6:
                return C17042R.string.chart_span_summary_y;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                throw new IllegalStateException("Unsupported futures graph span");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
