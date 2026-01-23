package com.robinhood.shared.tradeladder.p398ui.ladder.ftux;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TerminalLadderTransitionState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/TerminalLadderTransitionState;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "<init>", "()V", "lottieAnimationSpec", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "getLottieAnimationSpec$annotations", "getLottieAnimationSpec", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState$LottieAnimationSpec;", "nextState", "title", "", "prevState", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TerminalLadderTransitionState implements GenericLadderFtuxProgressState {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TerminalLadderTransitionState> CREATOR = new Creator();
    private final GenericLadderFtuxProgressState.LottieAnimationSpec lottieAnimationSpec;

    /* compiled from: TerminalLadderTransitionState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<TerminalLadderTransitionState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TerminalLadderTransitionState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new TerminalLadderTransitionState();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TerminalLadderTransitionState[] newArray(int i) {
            return new TerminalLadderTransitionState[i];
        }
    }

    public static /* synthetic */ void getLottieAnimationSpec$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
    public GenericLadderFtuxProgressState nextState(String title) {
        return null;
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
    public GenericLadderFtuxProgressState prevState() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
    public void prefetchLottie(Context context, boolean z) {
        GenericLadderFtuxProgressState.DefaultImpls.prefetchLottie(this, context, z);
    }

    @Override // com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState
    public GenericLadderFtuxProgressState.LottieAnimationSpec getLottieAnimationSpec() {
        return this.lottieAnimationSpec;
    }
}
