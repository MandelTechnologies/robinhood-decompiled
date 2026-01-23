package com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: DetailContent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/LadderTopBarPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/LadderTopBarPreviewParameterProvider$Parameters;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Parameters", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.LadderTopBarPreviewParameterProvider, reason: use source file name */
/* loaded from: classes12.dex */
public final class DetailContent8 implements PreviewParameterProvider<Parameters> {
    public static final int $stable = 8;
    private final Sequence<Parameters> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public DetailContent8() {
        Parameters parameters = new Parameters(null, null, true, null);
        Parameters parameters2 = new Parameters(null, null, false, null);
        long j = 10;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Parameters parameters3 = new Parameters(bigDecimalValueOf, null, true, null);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        long j2 = 11;
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
        Parameters parameters4 = new Parameters(bigDecimalValueOf2, bigDecimalValueOf3, true, null);
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf4, "valueOf(...)");
        Parameters parameters5 = new Parameters(bigDecimalValueOf4, null, false, null);
        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf5, "valueOf(...)");
        BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf6, "valueOf(...)");
        Parameters parameters6 = new Parameters(bigDecimalValueOf5, bigDecimalValueOf6, false, null);
        BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf7, "valueOf(...)");
        Parameters parameters7 = new Parameters(null, bigDecimalValueOf7, true, new DayPnlInfo(true, StringResource.INSTANCE.invoke("This is a tooltip")));
        long j3 = -10;
        BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(j3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf8, "valueOf(...)");
        Parameters parameters8 = new Parameters(bigDecimalValueOf8, null, true, null);
        BigDecimal bigDecimalValueOf9 = BigDecimal.valueOf(j3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf9, "valueOf(...)");
        long j4 = -11;
        BigDecimal bigDecimalValueOf10 = BigDecimal.valueOf(j4);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf10, "valueOf(...)");
        Parameters parameters9 = new Parameters(bigDecimalValueOf9, bigDecimalValueOf10, true, null);
        BigDecimal bigDecimalValueOf11 = BigDecimal.valueOf(j3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf11, "valueOf(...)");
        Parameters parameters10 = new Parameters(bigDecimalValueOf11, null, false, null);
        BigDecimal bigDecimalValueOf12 = BigDecimal.valueOf(j3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf12, "valueOf(...)");
        BigDecimal bigDecimalValueOf13 = BigDecimal.valueOf(j4);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf13, "valueOf(...)");
        this.values = SequencesKt.sequenceOf(parameters, parameters2, parameters3, parameters4, parameters5, parameters6, parameters7, parameters8, parameters9, parameters10, new Parameters(bigDecimalValueOf12, bigDecimalValueOf13, false, null));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Parameters> getValues() {
        return this.values;
    }

    /* compiled from: DetailContent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/LadderTopBarPreviewParameterProvider$Parameters;", "", "dayPL", "Ljava/math/BigDecimal;", "openPL", "hasPosition", "", "dayPnlInfo", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/DayPnlInfo;", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/DayPnlInfo;)V", "getDayPL", "()Ljava/math/BigDecimal;", "getOpenPL", "getHasPosition", "()Z", "getDayPnlInfo", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/DayPnlInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.LadderTopBarPreviewParameterProvider$Parameters, reason: from toString */
    public static final /* data */ class Parameters {
        public static final int $stable = 8;
        private final BigDecimal dayPL;
        private final DayPnlInfo dayPnlInfo;
        private final boolean hasPosition;
        private final BigDecimal openPL;

        public static /* synthetic */ Parameters copy$default(Parameters parameters, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, DayPnlInfo dayPnlInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = parameters.dayPL;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = parameters.openPL;
            }
            if ((i & 4) != 0) {
                z = parameters.hasPosition;
            }
            if ((i & 8) != 0) {
                dayPnlInfo = parameters.dayPnlInfo;
            }
            return parameters.copy(bigDecimal, bigDecimal2, z, dayPnlInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getDayPL() {
            return this.dayPL;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getOpenPL() {
            return this.openPL;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasPosition() {
            return this.hasPosition;
        }

        /* renamed from: component4, reason: from getter */
        public final DayPnlInfo getDayPnlInfo() {
            return this.dayPnlInfo;
        }

        public final Parameters copy(BigDecimal dayPL, BigDecimal openPL, boolean hasPosition, DayPnlInfo dayPnlInfo) {
            return new Parameters(dayPL, openPL, hasPosition, dayPnlInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return Intrinsics.areEqual(this.dayPL, parameters.dayPL) && Intrinsics.areEqual(this.openPL, parameters.openPL) && this.hasPosition == parameters.hasPosition && Intrinsics.areEqual(this.dayPnlInfo, parameters.dayPnlInfo);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.dayPL;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.openPL;
            int iHashCode2 = (((iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.hasPosition)) * 31;
            DayPnlInfo dayPnlInfo = this.dayPnlInfo;
            return iHashCode2 + (dayPnlInfo != null ? dayPnlInfo.hashCode() : 0);
        }

        public String toString() {
            return "Parameters(dayPL=" + this.dayPL + ", openPL=" + this.openPL + ", hasPosition=" + this.hasPosition + ", dayPnlInfo=" + this.dayPnlInfo + ")";
        }

        public Parameters(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, DayPnlInfo dayPnlInfo) {
            this.dayPL = bigDecimal;
            this.openPL = bigDecimal2;
            this.hasPosition = z;
            this.dayPnlInfo = dayPnlInfo;
        }

        public final BigDecimal getDayPL() {
            return this.dayPL;
        }

        public final BigDecimal getOpenPL() {
            return this.openPL;
        }

        public final boolean getHasPosition() {
            return this.hasPosition;
        }

        public final DayPnlInfo getDayPnlInfo() {
            return this.dayPnlInfo;
        }
    }
}
