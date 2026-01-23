package com.robinhood.shared.trading.tradecomponentscompose.traderow;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: TradeButton.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradecomponentscompose/traderow/TradeRowButtonPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/trading/tradecomponentscompose/traderow/TradeRowButtonPreviewParameterProvider$Parameters;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Parameters", "lib-trade-components-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeRowButtonPreviewParameterProvider, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeButton3 implements PreviewParameterProvider<Parameters> {
    public static final int $stable = 8;
    private final Sequence<Parameters> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public TradeButton3() {
        boolean z = false;
        Parameters parameters = new Parameters(true, z, "Buy MKT", 0L, 0L, 24, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Parameters parameters2 = new Parameters(z, true, "Buy MKT", 0L, 0L, 24, defaultConstructorMarker);
        Color.Companion companion = Color.INSTANCE;
        Parameters parameters3 = new Parameters(false, true, "Submit", companion.m6727getWhite0d7_KjU(), companion.m6721getGreen0d7_KjU(), defaultConstructorMarker);
        boolean z2 = false;
        boolean z3 = true;
        Parameters parameters4 = new Parameters(z2, z3, "Submit", companion.m6727getWhite0d7_KjU(), companion.m6724getRed0d7_KjU(), null);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        long j = 0;
        Parameters parameters5 = new Parameters(z2, z3, "Sell MKT", companion.m6724getRed0d7_KjU(), j, 16, defaultConstructorMarker2);
        boolean z4 = false;
        this.values = SequencesKt.sequenceOf(parameters, parameters2, parameters3, parameters4, parameters5, new Parameters(z2, z4, "Buy MKT", 0L, j, 24, defaultConstructorMarker2), new Parameters(z2, z4, "Sell MKT", companion.m6724getRed0d7_KjU(), j, 16, defaultConstructorMarker2));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Parameters> getValues() {
        return this.values;
    }

    /* compiled from: TradeButton.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradecomponentscompose/traderow/TradeRowButtonPreviewParameterProvider$Parameters;", "", "isLoading", "", "enabled", "text", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "<init>", "(ZZLjava/lang/String;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "()Z", "getEnabled", "getText", "()Ljava/lang/String;", "getColor-0d7_KjU", "()J", "J", "getBackgroundColor-0d7_KjU", "component1", "component2", "component3", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-jZ3TX3s", "(ZZLjava/lang/String;JJ)Lcom/robinhood/shared/trading/tradecomponentscompose/traderow/TradeRowButtonPreviewParameterProvider$Parameters;", "equals", "other", "hashCode", "", "toString", "lib-trade-components-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trading.tradecomponentscompose.traderow.TradeRowButtonPreviewParameterProvider$Parameters, reason: from toString */
    public static final /* data */ class Parameters {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final long color;
        private final boolean enabled;
        private final boolean isLoading;
        private final String text;

        public /* synthetic */ Parameters(boolean z, boolean z2, String str, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, str, j, j2);
        }

        /* renamed from: copy-jZ3TX3s$default, reason: not valid java name */
        public static /* synthetic */ Parameters m26334copyjZ3TX3s$default(Parameters parameters, boolean z, boolean z2, String str, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = parameters.isLoading;
            }
            if ((i & 2) != 0) {
                z2 = parameters.enabled;
            }
            if ((i & 4) != 0) {
                str = parameters.text;
            }
            if ((i & 8) != 0) {
                j = parameters.color;
            }
            if ((i & 16) != 0) {
                j2 = parameters.backgroundColor;
            }
            long j3 = j2;
            String str2 = str;
            return parameters.m26337copyjZ3TX3s(z, z2, str2, j, j3);
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
        public final String getText() {
            return this.text;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: copy-jZ3TX3s, reason: not valid java name */
        public final Parameters m26337copyjZ3TX3s(boolean isLoading, boolean enabled, String text, long color, long backgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Parameters(isLoading, enabled, text, color, backgroundColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return this.isLoading == parameters.isLoading && this.enabled == parameters.enabled && Intrinsics.areEqual(this.text, parameters.text) && Color.m6707equalsimpl0(this.color, parameters.color) && Color.m6707equalsimpl0(this.backgroundColor, parameters.backgroundColor);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.text.hashCode()) * 31) + Color.m6713hashCodeimpl(this.color)) * 31) + Color.m6713hashCodeimpl(this.backgroundColor);
        }

        public String toString() {
            return "Parameters(isLoading=" + this.isLoading + ", enabled=" + this.enabled + ", text=" + this.text + ", color=" + Color.m6714toStringimpl(this.color) + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ")";
        }

        private Parameters(boolean z, boolean z2, String text, long j, long j2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.isLoading = z;
            this.enabled = z2;
            this.text = text;
            this.color = j;
            this.backgroundColor = j2;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getText() {
            return this.text;
        }

        public /* synthetic */ Parameters(boolean z, boolean z2, String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, str, (i & 8) != 0 ? Color.INSTANCE.m6721getGreen0d7_KjU() : j, (i & 16) != 0 ? Color.INSTANCE.m6725getTransparent0d7_KjU() : j2, null);
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m26339getColor0d7_KjU() {
            return this.color;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m26338getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }
    }
}
