package com.robinhood.android.social.contracts.matcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.util.Money;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransaction.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u000b\f\r\u000e\u000fR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "getDirection", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "entryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "getEntryPoint", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "Create", "Review", "ReviewRequestPayment", "Direction", "EntryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Create;", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Review;", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$ReviewRequestPayment;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface MatchaTransaction extends IntentKey, Parcelable {
    Direction getDirection();

    EntryPoint getEntryPoint();

    /* compiled from: MatchaTransaction.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static NavigationType getNavigationType(MatchaTransaction matchaTransaction) {
            return IntentKey.DefaultImpls.getNavigationType(matchaTransaction);
        }
    }

    /* compiled from: MatchaTransaction.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Create;", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction;", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "entryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "<init>", "(Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;)V", "getDirection", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "getEntryPoint", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Create implements MatchaTransaction {
        public static final Parcelable.Creator<Create> CREATOR = new Creator();
        private final Direction direction;
        private final EntryPoint entryPoint;

        /* compiled from: MatchaTransaction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<Create> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Create createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create(Direction.valueOf(parcel.readString()), EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Create[] newArray(int i) {
                return new Create[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.direction.name());
            dest.writeString(this.entryPoint.name());
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public Create(Direction direction, EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.direction = direction;
            this.entryPoint = entryPoint;
        }

        @Override // com.robinhood.android.social.contracts.matcha.MatchaTransaction
        public Direction getDirection() {
            return this.direction;
        }

        @Override // com.robinhood.android.social.contracts.matcha.MatchaTransaction
        public EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: MatchaTransaction.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Review;", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction;", "amount", "Lcom/robinhood/models/util/Money;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "entryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/matcha/models/ui/Transactor;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "getDirection", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "getEntryPoint", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Review implements MatchaTransaction {
        public static final Parcelable.Creator<Review> CREATOR = new Creator();
        private final Money amount;
        private final Direction direction;
        private final EntryPoint entryPoint;
        private final Transactor transactor;

        /* compiled from: MatchaTransaction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<Review> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Review createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review((Money) parcel.readParcelable(Review.class.getClassLoader()), (Transactor) parcel.readParcelable(Review.class.getClassLoader()), Direction.valueOf(parcel.readString()), EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Review[] newArray(int i) {
                return new Review[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeParcelable(this.transactor, flags);
            dest.writeString(this.direction.name());
            dest.writeString(this.entryPoint.name());
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public Review(Money money, Transactor transactor, Direction direction, EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(transactor, "transactor");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.amount = money;
            this.transactor = transactor;
            this.direction = direction;
            this.entryPoint = entryPoint;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final Transactor getTransactor() {
            return this.transactor;
        }

        @Override // com.robinhood.android.social.contracts.matcha.MatchaTransaction
        public Direction getDirection() {
            return this.direction;
        }

        @Override // com.robinhood.android.social.contracts.matcha.MatchaTransaction
        public EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: MatchaTransaction.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$ReviewRequestPayment;", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction;", "amount", "Lcom/robinhood/models/util/Money;", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "requestId", "Ljava/util/UUID;", MemoInputActivity.EXTRA_MEMO, "", "entryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/matcha/models/ui/Transactor;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "getRequestId", "()Ljava/util/UUID;", "getMemo", "()Ljava/lang/String;", "getEntryPoint", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "getDirection$annotations", "()V", "getDirection", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReviewRequestPayment implements MatchaTransaction {
        public static final Parcelable.Creator<ReviewRequestPayment> CREATOR = new Creator();
        private final Money amount;
        private final Direction direction;
        private final EntryPoint entryPoint;
        private final String memo;
        private final UUID requestId;
        private final Transactor transactor;

        /* compiled from: MatchaTransaction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<ReviewRequestPayment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReviewRequestPayment createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewRequestPayment((Money) parcel.readParcelable(ReviewRequestPayment.class.getClassLoader()), (Transactor) parcel.readParcelable(ReviewRequestPayment.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readString(), EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReviewRequestPayment[] newArray(int i) {
                return new ReviewRequestPayment[i];
            }
        }

        public static /* synthetic */ void getDirection$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeParcelable(this.transactor, flags);
            dest.writeSerializable(this.requestId);
            dest.writeString(this.memo);
            dest.writeString(this.entryPoint.name());
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public ReviewRequestPayment(Money amount, Transactor transactor, UUID requestId, String str, EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactor, "transactor");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.amount = amount;
            this.transactor = transactor;
            this.requestId = requestId;
            this.memo = str;
            this.entryPoint = entryPoint;
            this.direction = Direction.SEND;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final Transactor getTransactor() {
            return this.transactor;
        }

        public final UUID getRequestId() {
            return this.requestId;
        }

        public final String getMemo() {
            return this.memo;
        }

        @Override // com.robinhood.android.social.contracts.matcha.MatchaTransaction
        public EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        @Override // com.robinhood.android.social.contracts.matcha.MatchaTransaction
        public Direction getDirection() {
            return this.direction;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MatchaTransaction.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "SEND", "REQUEST", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Direction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction SEND = new Direction("SEND", 0);
        public static final Direction REQUEST = new Direction("REQUEST", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{SEND, REQUEST};
        }

        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        private Direction(String str, int i) {
        }

        static {
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MatchaTransaction.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "", "<init>", "(Ljava/lang/String;I)V", "CASH_TAB", "PROFILE", "QR_CODE", "INCENTIVE_INTRO", "INSTANT_WITHDRAWAL_INTRO", "PENDING_TRANSACTIONS", "CLAIM_TRANSFER", "PAY_REQUEST", "REFERRAL_BONUS", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class EntryPoint {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint CASH_TAB = new EntryPoint("CASH_TAB", 0);
        public static final EntryPoint PROFILE = new EntryPoint("PROFILE", 1);
        public static final EntryPoint QR_CODE = new EntryPoint("QR_CODE", 2);
        public static final EntryPoint INCENTIVE_INTRO = new EntryPoint("INCENTIVE_INTRO", 3);
        public static final EntryPoint INSTANT_WITHDRAWAL_INTRO = new EntryPoint("INSTANT_WITHDRAWAL_INTRO", 4);
        public static final EntryPoint PENDING_TRANSACTIONS = new EntryPoint("PENDING_TRANSACTIONS", 5);
        public static final EntryPoint CLAIM_TRANSFER = new EntryPoint("CLAIM_TRANSFER", 6);
        public static final EntryPoint PAY_REQUEST = new EntryPoint("PAY_REQUEST", 7);
        public static final EntryPoint REFERRAL_BONUS = new EntryPoint("REFERRAL_BONUS", 8);

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{CASH_TAB, PROFILE, QR_CODE, INCENTIVE_INTRO, INSTANT_WITHDRAWAL_INTRO, PENDING_TRANSACTIONS, CLAIM_TRANSFER, PAY_REQUEST, REFERRAL_BONUS};
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i) {
        }

        static {
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
        }

        public final String getIdentifier() {
            String lowerCase = name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }
}
