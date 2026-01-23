package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: LadderButton.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderButtonPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderButtonPreviewParameterProvider$Parameters;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Parameters", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderButtonPreviewParameterProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderButton2 implements PreviewParameterProvider<Parameters> {
    public static final int $stable = 8;
    private final Sequence<Parameters> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public LadderButton2() {
        FuturesOrderSide futuresOrderSide = FuturesOrderSide.BUY;
        Parameters parameters = new Parameters(true, false, futuresOrderSide);
        Parameters parameters2 = new Parameters(false, true, futuresOrderSide);
        FuturesOrderSide futuresOrderSide2 = FuturesOrderSide.SELL;
        this.values = SequencesKt.sequenceOf(parameters, parameters2, new Parameters(false, true, futuresOrderSide2), new Parameters(false, false, futuresOrderSide), new Parameters(false, false, futuresOrderSide2));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Parameters> getValues() {
        return this.values;
    }

    /* compiled from: LadderButton.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderButtonPreviewParameterProvider$Parameters;", "", "isLoading", "", "enabled", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "<init>", "(ZZLcom/robinhood/android/models/futures/api/order/FuturesOrderSide;)V", "()Z", "getEnabled", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "textColor", "Landroidx/compose/ui/graphics/Color;", "getTextColor", "(Landroidx/compose/runtime/Composer;I)J", "text", "", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderButtonPreviewParameterProvider$Parameters, reason: from toString */
    public static final /* data */ class Parameters {
        public static final int $stable = 0;
        private final boolean enabled;
        private final boolean isLoading;
        private final FuturesOrderSide side;
        private final String text;

        public static /* synthetic */ Parameters copy$default(Parameters parameters, boolean z, boolean z2, FuturesOrderSide futuresOrderSide, int i, Object obj) {
            if ((i & 1) != 0) {
                z = parameters.isLoading;
            }
            if ((i & 2) != 0) {
                z2 = parameters.enabled;
            }
            if ((i & 4) != 0) {
                futuresOrderSide = parameters.side;
            }
            return parameters.copy(z, z2, futuresOrderSide);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component3, reason: from getter */
        public final FuturesOrderSide getSide() {
            return this.side;
        }

        public final Parameters copy(boolean isLoading, boolean enabled, FuturesOrderSide side) {
            Intrinsics.checkNotNullParameter(side, "side");
            return new Parameters(isLoading, enabled, side);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return this.isLoading == parameters.isLoading && this.enabled == parameters.enabled && this.side == parameters.side;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.side.hashCode();
        }

        public String toString() {
            return "Parameters(isLoading=" + this.isLoading + ", enabled=" + this.enabled + ", side=" + this.side + ")";
        }

        public Parameters(boolean z, boolean z2, FuturesOrderSide side) {
            Intrinsics.checkNotNullParameter(side, "side");
            this.isLoading = z;
            this.enabled = z2;
            this.side = side;
            this.text = side == FuturesOrderSide.BUY ? "Buy MKT" : "Sell MKT";
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public /* synthetic */ Parameters(boolean z, boolean z2, FuturesOrderSide futuresOrderSide, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, (i & 4) != 0 ? FuturesOrderSide.BUY : futuresOrderSide);
        }

        public final FuturesOrderSide getSide() {
            return this.side;
        }

        @JvmName
        public final long getTextColor(Composer composer, int i) {
            long jM14818sellTextColorvNxB06k;
            composer.startReplaceGroup(-1554579604);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554579604, i, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderButtonPreviewParameterProvider.Parameters.<get-textColor> (LadderButton.kt:84)");
            }
            if (this.side == FuturesOrderSide.BUY) {
                composer.startReplaceGroup(151438392);
                jM14818sellTextColorvNxB06k = ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m14814buyTextColorvNxB06k(this.enabled);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(151537623);
                jM14818sellTextColorvNxB06k = ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m14818sellTextColorvNxB06k(this.enabled);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return jM14818sellTextColorvNxB06k;
        }

        public final String getText() {
            return this.text;
        }
    }
}
