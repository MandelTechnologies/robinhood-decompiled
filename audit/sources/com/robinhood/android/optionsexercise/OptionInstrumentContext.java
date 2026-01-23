package com.robinhood.android.optionsexercise;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionUnderlier;
import com.robinhood.models.p355ui.UiOptionInstrument;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionInstrumentContext.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", "Landroid/os/Parcelable;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "underlyingEquityId", "Ljava/util/UUID;", "lateCloseState", "Lcom/robinhood/models/db/OptionChain$LateCloseState;", "<init>", "(Lcom/robinhood/models/db/OptionInstrument;Ljava/util/UUID;Lcom/robinhood/models/db/OptionChain$LateCloseState;)V", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "getUnderlyingEquityId", "()Ljava/util/UUID;", "getLateCloseState", "()Lcom/robinhood/models/db/OptionChain$LateCloseState;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionInstrumentContext implements Parcelable {
    private final OptionChain.LateCloseState lateCloseState;
    private final OptionInstrument optionInstrument;
    private final UUID underlyingEquityId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionInstrumentContext> CREATOR = new Creator();

    /* compiled from: OptionInstrumentContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionInstrumentContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionInstrumentContext createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionInstrumentContext((OptionInstrument) parcel.readParcelable(OptionInstrumentContext.class.getClassLoader()), (UUID) parcel.readSerializable(), OptionChain.LateCloseState.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionInstrumentContext[] newArray(int i) {
            return new OptionInstrumentContext[i];
        }
    }

    public static /* synthetic */ OptionInstrumentContext copy$default(OptionInstrumentContext optionInstrumentContext, OptionInstrument optionInstrument, UUID uuid, OptionChain.LateCloseState lateCloseState, int i, Object obj) {
        if ((i & 1) != 0) {
            optionInstrument = optionInstrumentContext.optionInstrument;
        }
        if ((i & 2) != 0) {
            uuid = optionInstrumentContext.underlyingEquityId;
        }
        if ((i & 4) != 0) {
            lateCloseState = optionInstrumentContext.lateCloseState;
        }
        return optionInstrumentContext.copy(optionInstrument, uuid, lateCloseState);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getUnderlyingEquityId() {
        return this.underlyingEquityId;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChain.LateCloseState getLateCloseState() {
        return this.lateCloseState;
    }

    public final OptionInstrumentContext copy(OptionInstrument optionInstrument, UUID underlyingEquityId, OptionChain.LateCloseState lateCloseState) {
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(underlyingEquityId, "underlyingEquityId");
        Intrinsics.checkNotNullParameter(lateCloseState, "lateCloseState");
        return new OptionInstrumentContext(optionInstrument, underlyingEquityId, lateCloseState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionInstrumentContext)) {
            return false;
        }
        OptionInstrumentContext optionInstrumentContext = (OptionInstrumentContext) other;
        return Intrinsics.areEqual(this.optionInstrument, optionInstrumentContext.optionInstrument) && Intrinsics.areEqual(this.underlyingEquityId, optionInstrumentContext.underlyingEquityId) && this.lateCloseState == optionInstrumentContext.lateCloseState;
    }

    public int hashCode() {
        return (((this.optionInstrument.hashCode() * 31) + this.underlyingEquityId.hashCode()) * 31) + this.lateCloseState.hashCode();
    }

    public String toString() {
        return "OptionInstrumentContext(optionInstrument=" + this.optionInstrument + ", underlyingEquityId=" + this.underlyingEquityId + ", lateCloseState=" + this.lateCloseState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.optionInstrument, flags);
        dest.writeSerializable(this.underlyingEquityId);
        dest.writeString(this.lateCloseState.name());
    }

    public OptionInstrumentContext(OptionInstrument optionInstrument, UUID underlyingEquityId, OptionChain.LateCloseState lateCloseState) {
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(underlyingEquityId, "underlyingEquityId");
        Intrinsics.checkNotNullParameter(lateCloseState, "lateCloseState");
        this.optionInstrument = optionInstrument;
        this.underlyingEquityId = underlyingEquityId;
        this.lateCloseState = lateCloseState;
    }

    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    public final UUID getUnderlyingEquityId() {
        return this.underlyingEquityId;
    }

    public final OptionChain.LateCloseState getLateCloseState() {
        return this.lateCloseState;
    }

    /* compiled from: OptionInstrumentContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionInstrumentContext$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/optionsexercise/OptionInstrumentContext;", "uiOptionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionInstrumentContext from(UiOptionInstrument uiOptionInstrument) {
            Intrinsics.checkNotNullParameter(uiOptionInstrument, "uiOptionInstrument");
            OptionUnderlier optionUnderlier = (OptionUnderlier) CollectionsKt.singleOrNull((List) uiOptionInstrument.getOptionUnderliers());
            if (optionUnderlier == null) {
                return null;
            }
            return new OptionInstrumentContext(uiOptionInstrument.getOptionInstrument(), optionUnderlier.getInstrumentId(), uiOptionInstrument.getOptionChain().getLateCloseState());
        }
    }
}
