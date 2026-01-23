package com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: LadderQuantitySelectorButton.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/ui/LadderQuantitySelectorButtonPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/ui/LadderQuantitySelectorButtonPreviewParameterProvider$Parameters;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Parameters", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonPreviewParameterProvider, reason: use source file name */
/* loaded from: classes12.dex */
public final class LadderQuantitySelectorButton2 implements PreviewParameterProvider<Parameters> {
    public static final int $stable = 8;
    private final Sequence<Parameters> values = SequencesKt.sequenceOf(new Parameters("55 qty", true, false), new Parameters("0 qty", false, false), new Parameters("1 qty", false, true));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Parameters> getValues() {
        return this.values;
    }

    /* compiled from: LadderQuantitySelectorButton.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/ui/LadderQuantitySelectorButtonPreviewParameterProvider$Parameters;", "", "text", "", "enabled", "", "isQuantitySelectorOpen", "<init>", "(Ljava/lang/String;ZZ)V", "getText", "()Ljava/lang/String;", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonPreviewParameterProvider$Parameters, reason: from toString */
    public static final /* data */ class Parameters {
        public static final int $stable = 0;
        private final boolean enabled;
        private final boolean isQuantitySelectorOpen;
        private final String text;

        public static /* synthetic */ Parameters copy$default(Parameters parameters, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parameters.text;
            }
            if ((i & 2) != 0) {
                z = parameters.enabled;
            }
            if ((i & 4) != 0) {
                z2 = parameters.isQuantitySelectorOpen;
            }
            return parameters.copy(str, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsQuantitySelectorOpen() {
            return this.isQuantitySelectorOpen;
        }

        public final Parameters copy(String text, boolean enabled, boolean isQuantitySelectorOpen) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Parameters(text, enabled, isQuantitySelectorOpen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return Intrinsics.areEqual(this.text, parameters.text) && this.enabled == parameters.enabled && this.isQuantitySelectorOpen == parameters.isQuantitySelectorOpen;
        }

        public int hashCode() {
            return (((this.text.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isQuantitySelectorOpen);
        }

        public String toString() {
            return "Parameters(text=" + this.text + ", enabled=" + this.enabled + ", isQuantitySelectorOpen=" + this.isQuantitySelectorOpen + ")";
        }

        public Parameters(String text, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.enabled = z;
            this.isQuantitySelectorOpen = z2;
        }

        public final String getText() {
            return this.text;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean isQuantitySelectorOpen() {
            return this.isQuantitySelectorOpen;
        }
    }
}
