package com.robinhood.android.cortex.digest.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestDestinations.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestNavGraphDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Landroid/os/Parcelable;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestNavGraphDest, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestDestinations8 extends ComposableDestinationWithArgs<Parcelable> {
    public static final PortfolioDigestDestinations8 INSTANCE = new PortfolioDigestDestinations8();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<PortfolioDigestDestinations8> CREATOR = new Creator();

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestNavGraphDest$Creator */
    public static final class Creator implements Parcelable.Creator<PortfolioDigestDestinations8> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations8 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PortfolioDigestDestinations8.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations8[] newArray(int i) {
            return new PortfolioDigestDestinations8[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private PortfolioDigestDestinations8() {
        super("cortex_portfolio_digest", Parcelable.class, null, null, null, 28, null);
    }
}
