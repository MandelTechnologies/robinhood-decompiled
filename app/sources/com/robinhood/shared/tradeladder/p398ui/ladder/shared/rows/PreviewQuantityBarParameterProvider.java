package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: LadderRow.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/rows/PreviewQuantityBarParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/rows/PreviewQuantityBarParameterProvider$Parameters;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Parameters", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PreviewQuantityBarParameterProvider implements PreviewParameterProvider<Parameters> {
    public static final int $stable = 0;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    /* compiled from: LadderRow.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/rows/PreviewQuantityBarParameterProvider$Parameters;", "", "isDay", "", "side", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "<init>", "(ZLcom/robinhood/shared/tradeladder/ui/ladder/models/Side;)V", "()Z", "getSide", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Parameters {
        public static final int $stable = 0;
        private final boolean isDay;
        private final Side side;

        public static /* synthetic */ Parameters copy$default(Parameters parameters, boolean z, Side side, int i, Object obj) {
            if ((i & 1) != 0) {
                z = parameters.isDay;
            }
            if ((i & 2) != 0) {
                side = parameters.side;
            }
            return parameters.copy(z, side);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsDay() {
            return this.isDay;
        }

        /* renamed from: component2, reason: from getter */
        public final Side getSide() {
            return this.side;
        }

        public final Parameters copy(boolean isDay, Side side) {
            Intrinsics.checkNotNullParameter(side, "side");
            return new Parameters(isDay, side);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return this.isDay == parameters.isDay && this.side == parameters.side;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isDay) * 31) + this.side.hashCode();
        }

        public String toString() {
            return "Parameters(isDay=" + this.isDay + ", side=" + this.side + ")";
        }

        public Parameters(boolean z, Side side) {
            Intrinsics.checkNotNullParameter(side, "side");
            this.isDay = z;
            this.side = side;
        }

        public final boolean isDay() {
            return this.isDay;
        }

        public final Side getSide() {
            return this.side;
        }
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Parameters> getValues() {
        Side side = Side.START;
        Parameters parameters = new Parameters(true, side);
        Parameters parameters2 = new Parameters(false, side);
        Side side2 = Side.END;
        return SequencesKt.sequenceOf(parameters, parameters2, new Parameters(true, side2), new Parameters(false, side2));
    }
}
