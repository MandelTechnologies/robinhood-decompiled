package com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.TitleContentState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: TitleContent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentPreviewParameterProvider$Parameters;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Parameters", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.TitleContentPreviewParameterProvider, reason: use source file name */
/* loaded from: classes12.dex */
public final class TitleContent4 implements PreviewParameterProvider<Parameters> {
    public static final int $stable = 8;
    private final Sequence<Parameters> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public TitleContent4() {
        StringResource.Companion companion = StringResource.INSTANCE;
        Parameters parameters = new Parameters(new TitleContentState(companion.invoke("AAPL"), false, companion.invoke("+1.23%"), TitleContentState.DeltaDirection.POSITIVE, false));
        StringResource stringResourceInvoke = companion.invoke("AAPL");
        StringResource stringResourceInvoke2 = companion.invoke("-1.23%");
        TitleContentState.DeltaDirection deltaDirection = TitleContentState.DeltaDirection.NEGATIVE;
        Parameters parameters2 = new Parameters(new TitleContentState(stringResourceInvoke, false, stringResourceInvoke2, deltaDirection, false));
        Parameters parameters3 = new Parameters(new TitleContentState(companion.invoke("AAPL"), false, companion.invoke("0.00%"), TitleContentState.DeltaDirection.NONE, false));
        TitleContentState.Companion companion2 = TitleContentState.INSTANCE;
        this.values = SequencesKt.sequenceOf(parameters, parameters2, parameters3, new Parameters(companion2.createLoadingState(companion.invoke("AAPL"), null, null)), new Parameters(companion2.createLoadingState(null, companion.invoke("-1.23%"), deltaDirection)));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Parameters> getValues() {
        return this.values;
    }

    /* compiled from: TitleContent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentPreviewParameterProvider$Parameters;", "", "state", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState;)V", "getState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/topbar/TitleContentState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.TitleContentPreviewParameterProvider$Parameters, reason: from toString */
    public static final /* data */ class Parameters {
        public static final int $stable = StringResource.$stable;
        private final TitleContentState state;

        public static /* synthetic */ Parameters copy$default(Parameters parameters, TitleContentState titleContentState, int i, Object obj) {
            if ((i & 1) != 0) {
                titleContentState = parameters.state;
            }
            return parameters.copy(titleContentState);
        }

        /* renamed from: component1, reason: from getter */
        public final TitleContentState getState() {
            return this.state;
        }

        public final Parameters copy(TitleContentState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Parameters(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Parameters) && Intrinsics.areEqual(this.state, ((Parameters) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Parameters(state=" + this.state + ")";
        }

        public Parameters(TitleContentState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final TitleContentState getState() {
            return this.state;
        }
    }
}
