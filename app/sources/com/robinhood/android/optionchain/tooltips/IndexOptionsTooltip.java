package com.robinhood.android.optionchain.tooltips;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexOptionsTooltip.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip;", "", "<init>", "()V", "MultipleUnderlyingsTooltip", "SettleOnOpenTooltip", "Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip$MultipleUnderlyingsTooltip;", "Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip$SettleOnOpenTooltip;", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class IndexOptionsTooltip {
    public static final int $stable = 0;

    public /* synthetic */ IndexOptionsTooltip(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IndexOptionsTooltip() {
    }

    /* compiled from: IndexOptionsTooltip.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip$MultipleUnderlyingsTooltip;", "Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip;", "nibHorizontalBias", "", "textRes", "Lcom/robinhood/utils/resource/StringResource;", "linkTextRes", "linkRes", "<init>", "(FLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getNibHorizontalBias", "()F", "getTextRes", "()Lcom/robinhood/utils/resource/StringResource;", "getLinkTextRes", "getLinkRes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MultipleUnderlyingsTooltip extends IndexOptionsTooltip {
        public static final int $stable = StringResource.$stable;
        private final StringResource linkRes;
        private final StringResource linkTextRes;
        private final float nibHorizontalBias;
        private final StringResource textRes;

        public static /* synthetic */ MultipleUnderlyingsTooltip copy$default(MultipleUnderlyingsTooltip multipleUnderlyingsTooltip, float f, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = multipleUnderlyingsTooltip.nibHorizontalBias;
            }
            if ((i & 2) != 0) {
                stringResource = multipleUnderlyingsTooltip.textRes;
            }
            if ((i & 4) != 0) {
                stringResource2 = multipleUnderlyingsTooltip.linkTextRes;
            }
            if ((i & 8) != 0) {
                stringResource3 = multipleUnderlyingsTooltip.linkRes;
            }
            return multipleUnderlyingsTooltip.copy(f, stringResource, stringResource2, stringResource3);
        }

        /* renamed from: component1, reason: from getter */
        public final float getNibHorizontalBias() {
            return this.nibHorizontalBias;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTextRes() {
            return this.textRes;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getLinkTextRes() {
            return this.linkTextRes;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getLinkRes() {
            return this.linkRes;
        }

        public final MultipleUnderlyingsTooltip copy(float nibHorizontalBias, StringResource textRes, StringResource linkTextRes, StringResource linkRes) {
            Intrinsics.checkNotNullParameter(textRes, "textRes");
            Intrinsics.checkNotNullParameter(linkTextRes, "linkTextRes");
            Intrinsics.checkNotNullParameter(linkRes, "linkRes");
            return new MultipleUnderlyingsTooltip(nibHorizontalBias, textRes, linkTextRes, linkRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleUnderlyingsTooltip)) {
                return false;
            }
            MultipleUnderlyingsTooltip multipleUnderlyingsTooltip = (MultipleUnderlyingsTooltip) other;
            return Float.compare(this.nibHorizontalBias, multipleUnderlyingsTooltip.nibHorizontalBias) == 0 && Intrinsics.areEqual(this.textRes, multipleUnderlyingsTooltip.textRes) && Intrinsics.areEqual(this.linkTextRes, multipleUnderlyingsTooltip.linkTextRes) && Intrinsics.areEqual(this.linkRes, multipleUnderlyingsTooltip.linkRes);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.nibHorizontalBias) * 31) + this.textRes.hashCode()) * 31) + this.linkTextRes.hashCode()) * 31) + this.linkRes.hashCode();
        }

        public String toString() {
            return "MultipleUnderlyingsTooltip(nibHorizontalBias=" + this.nibHorizontalBias + ", textRes=" + this.textRes + ", linkTextRes=" + this.linkTextRes + ", linkRes=" + this.linkRes + ")";
        }

        public final float getNibHorizontalBias() {
            return this.nibHorizontalBias;
        }

        public final StringResource getTextRes() {
            return this.textRes;
        }

        public final StringResource getLinkTextRes() {
            return this.linkTextRes;
        }

        public final StringResource getLinkRes() {
            return this.linkRes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleUnderlyingsTooltip(float f, StringResource textRes, StringResource linkTextRes, StringResource linkRes) {
            super(null);
            Intrinsics.checkNotNullParameter(textRes, "textRes");
            Intrinsics.checkNotNullParameter(linkTextRes, "linkTextRes");
            Intrinsics.checkNotNullParameter(linkRes, "linkRes");
            this.nibHorizontalBias = f;
            this.textRes = textRes;
            this.linkTextRes = linkTextRes;
            this.linkRes = linkRes;
        }
    }

    /* compiled from: IndexOptionsTooltip.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip$SettleOnOpenTooltip;", "Lcom/robinhood/android/optionchain/tooltips/IndexOptionsTooltip;", "nibHorizontalBias", "", "textRes", "Lcom/robinhood/utils/resource/StringResource;", "linkTextRes", "linkRes", "<init>", "(FLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getNibHorizontalBias", "()F", "getTextRes", "()Lcom/robinhood/utils/resource/StringResource;", "getLinkTextRes", "getLinkRes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SettleOnOpenTooltip extends IndexOptionsTooltip {
        public static final int $stable = StringResource.$stable;
        private final StringResource linkRes;
        private final StringResource linkTextRes;
        private final float nibHorizontalBias;
        private final StringResource textRes;

        public static /* synthetic */ SettleOnOpenTooltip copy$default(SettleOnOpenTooltip settleOnOpenTooltip, float f, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = settleOnOpenTooltip.nibHorizontalBias;
            }
            if ((i & 2) != 0) {
                stringResource = settleOnOpenTooltip.textRes;
            }
            if ((i & 4) != 0) {
                stringResource2 = settleOnOpenTooltip.linkTextRes;
            }
            if ((i & 8) != 0) {
                stringResource3 = settleOnOpenTooltip.linkRes;
            }
            return settleOnOpenTooltip.copy(f, stringResource, stringResource2, stringResource3);
        }

        /* renamed from: component1, reason: from getter */
        public final float getNibHorizontalBias() {
            return this.nibHorizontalBias;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTextRes() {
            return this.textRes;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getLinkTextRes() {
            return this.linkTextRes;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getLinkRes() {
            return this.linkRes;
        }

        public final SettleOnOpenTooltip copy(float nibHorizontalBias, StringResource textRes, StringResource linkTextRes, StringResource linkRes) {
            Intrinsics.checkNotNullParameter(textRes, "textRes");
            Intrinsics.checkNotNullParameter(linkTextRes, "linkTextRes");
            Intrinsics.checkNotNullParameter(linkRes, "linkRes");
            return new SettleOnOpenTooltip(nibHorizontalBias, textRes, linkTextRes, linkRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettleOnOpenTooltip)) {
                return false;
            }
            SettleOnOpenTooltip settleOnOpenTooltip = (SettleOnOpenTooltip) other;
            return Float.compare(this.nibHorizontalBias, settleOnOpenTooltip.nibHorizontalBias) == 0 && Intrinsics.areEqual(this.textRes, settleOnOpenTooltip.textRes) && Intrinsics.areEqual(this.linkTextRes, settleOnOpenTooltip.linkTextRes) && Intrinsics.areEqual(this.linkRes, settleOnOpenTooltip.linkRes);
        }

        public int hashCode() {
            return (((((Float.hashCode(this.nibHorizontalBias) * 31) + this.textRes.hashCode()) * 31) + this.linkTextRes.hashCode()) * 31) + this.linkRes.hashCode();
        }

        public String toString() {
            return "SettleOnOpenTooltip(nibHorizontalBias=" + this.nibHorizontalBias + ", textRes=" + this.textRes + ", linkTextRes=" + this.linkTextRes + ", linkRes=" + this.linkRes + ")";
        }

        public final float getNibHorizontalBias() {
            return this.nibHorizontalBias;
        }

        public final StringResource getTextRes() {
            return this.textRes;
        }

        public final StringResource getLinkTextRes() {
            return this.linkTextRes;
        }

        public final StringResource getLinkRes() {
            return this.linkRes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettleOnOpenTooltip(float f, StringResource textRes, StringResource linkTextRes, StringResource linkRes) {
            super(null);
            Intrinsics.checkNotNullParameter(textRes, "textRes");
            Intrinsics.checkNotNullParameter(linkTextRes, "linkTextRes");
            Intrinsics.checkNotNullParameter(linkRes, "linkRes");
            this.nibHorizontalBias = f;
            this.textRes = textRes;
            this.linkTextRes = linkTextRes;
            this.linkRes = linkRes;
        }
    }
}
