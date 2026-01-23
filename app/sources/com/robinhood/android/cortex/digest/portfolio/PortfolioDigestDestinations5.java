package com.robinhood.android.cortex.digest.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestDestinations.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest;", "Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Args", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestErrorDest, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestDestinations5 extends DialogDestinationWithArgs<Args> {
    public static final PortfolioDigestDestinations5 INSTANCE = new PortfolioDigestDestinations5();
    public static final int $stable = DialogDestinationWithArgs.$stable;
    public static final Parcelable.Creator<PortfolioDigestDestinations5> CREATOR = new Creator();

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestErrorDest$Creator */
    public static final class Creator implements Parcelable.Creator<PortfolioDigestDestinations5> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations5 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PortfolioDigestDestinations5.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PortfolioDigestDestinations5[] newArray(int i) {
            return new PortfolioDigestDestinations5[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private PortfolioDigestDestinations5() {
        super("portfolio_digest_error", Args.class);
    }

    /* compiled from: PortfolioDigestDestinations.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args;", "Landroid/os/Parcelable;", "id", "", "getId", "()I", "Error", "Message", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args$Error;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args$Message;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestErrorDest$Args */
    public interface Args extends Parcelable {
        int getId();

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args$Error;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args;", "id", "", "throwable", "", "<init>", "(ILjava/lang/Throwable;)V", "getId", "()I", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestErrorDest$Args$Error, reason: from toString */
        public static final /* data */ class Error implements Args {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Error> CREATOR = new Creator();
            private final int id;
            private final Throwable throwable;

            /* compiled from: PortfolioDigestDestinations.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestErrorDest$Args$Error$Creator */
            public static final class Creator implements Parcelable.Creator<Error> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Error(parcel.readInt(), (Throwable) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }

            public static /* synthetic */ Error copy$default(Error error, int i, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = error.id;
                }
                if ((i2 & 2) != 0) {
                    th = error.throwable;
                }
                return error.copy(i, th);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(int id, Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(id, throwable);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return this.id == error.id && Intrinsics.areEqual(this.throwable, error.throwable);
            }

            public int hashCode() {
                return (Integer.hashCode(this.id) * 31) + this.throwable.hashCode();
            }

            public String toString() {
                return "Error(id=" + this.id + ", throwable=" + this.throwable + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.id);
                dest.writeSerializable(this.throwable);
            }

            public Error(int i, Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.id = i;
                this.throwable = throwable;
            }

            public /* synthetic */ Error(int i, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? C11048R.id.dialog_id_generic_error : i, th);
            }

            @Override // com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations5.Args
            public int getId() {
                return this.id;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        /* compiled from: PortfolioDigestDestinations.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args$Message;", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestErrorDest$Args;", "id", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestErrorDest$Args$Message, reason: from toString */
        public static final /* data */ class Message implements Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Message> CREATOR = new Creator();
            private final int id;
            private final String message;

            /* compiled from: PortfolioDigestDestinations.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestErrorDest$Args$Message$Creator */
            public static final class Creator implements Parcelable.Creator<Message> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Message createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Message(parcel.readInt(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Message[] newArray(int i) {
                    return new Message[i];
                }
            }

            public static /* synthetic */ Message copy$default(Message message, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = message.id;
                }
                if ((i2 & 2) != 0) {
                    str = message.message;
                }
                return message.copy(i, str);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Message copy(int id, String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Message(id, message);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Message)) {
                    return false;
                }
                Message message = (Message) other;
                return this.id == message.id && Intrinsics.areEqual(this.message, message.message);
            }

            public int hashCode() {
                return (Integer.hashCode(this.id) * 31) + this.message.hashCode();
            }

            public String toString() {
                return "Message(id=" + this.id + ", message=" + this.message + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.id);
                dest.writeString(this.message);
            }

            public Message(int i, String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.id = i;
                this.message = message;
            }

            public /* synthetic */ Message(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? C11048R.id.dialog_id_generic_error : i, str);
            }

            @Override // com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations5.Args
            public int getId() {
                return this.id;
            }

            public final String getMessage() {
                return this.message;
            }
        }
    }
}
