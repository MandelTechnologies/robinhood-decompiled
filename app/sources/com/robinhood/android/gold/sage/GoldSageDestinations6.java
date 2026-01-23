package com.robinhood.android.gold.sage;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import gold.proto.p464v1.CreateSageApplicationResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageDestinations.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/WebViewDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/android/gold/sage/WebViewDest$Args;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.WebViewDest, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageDestinations6 extends ComposableDestinationWithArgs<Args> {
    public static final GoldSageDestinations6 INSTANCE = new GoldSageDestinations6();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<GoldSageDestinations6> CREATOR = new Creator();

    /* compiled from: GoldSageDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.sage.WebViewDest$Creator */
    public static final class Creator implements Parcelable.Creator<GoldSageDestinations6> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageDestinations6 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return GoldSageDestinations6.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageDestinations6[] newArray(int i) {
            return new GoldSageDestinations6[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private GoldSageDestinations6() {
        super("gold_sage_web_view", Args.class, null, null, null, 28, null);
    }

    /* compiled from: GoldSageDestinations.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/WebViewDest$Args;", "Landroid/os/Parcelable;", "sageApplicationResponse", "Lgold/proto/v1/CreateSageApplicationResponse;", "<init>", "(Lgold/proto/v1/CreateSageApplicationResponse;)V", "getSageApplicationResponse", "()Lgold/proto/v1/CreateSageApplicationResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.sage.WebViewDest$Args, reason: from toString */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CreateSageApplicationResponse sageApplicationResponse;

        /* compiled from: GoldSageDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.gold.sage.WebViewDest$Args$Creator */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((CreateSageApplicationResponse) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CreateSageApplicationResponse createSageApplicationResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                createSageApplicationResponse = args.sageApplicationResponse;
            }
            return args.copy(createSageApplicationResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final CreateSageApplicationResponse getSageApplicationResponse() {
            return this.sageApplicationResponse;
        }

        public final Args copy(CreateSageApplicationResponse sageApplicationResponse) {
            Intrinsics.checkNotNullParameter(sageApplicationResponse, "sageApplicationResponse");
            return new Args(sageApplicationResponse);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.sageApplicationResponse, ((Args) other).sageApplicationResponse);
        }

        public int hashCode() {
            return this.sageApplicationResponse.hashCode();
        }

        public String toString() {
            return "Args(sageApplicationResponse=" + this.sageApplicationResponse + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.sageApplicationResponse);
        }

        public Args(CreateSageApplicationResponse sageApplicationResponse) {
            Intrinsics.checkNotNullParameter(sageApplicationResponse, "sageApplicationResponse");
            this.sageApplicationResponse = sageApplicationResponse;
        }

        public final CreateSageApplicationResponse getSageApplicationResponse() {
            return this.sageApplicationResponse;
        }
    }
}
