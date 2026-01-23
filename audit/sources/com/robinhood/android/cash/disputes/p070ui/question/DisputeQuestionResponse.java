package com.robinhood.android.cash.disputes.p070ui.question;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cash.disputes.util.DisputeFileData;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.models.util.Money;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: DisputeQuestionResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "Landroid/os/Parcelable;", "<init>", "()V", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "nextQuestionId", "Ljava/util/UUID;", "getNextQuestionId", "()Ljava/util/UUID;", "Text", "Decimal", "Date", "Media", "MultipleChoice", "DuplicateAuthorizedTransaction", "Skip", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Date;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Decimal;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$DuplicateAuthorizedTransaction;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Media;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$MultipleChoice;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Skip;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Text;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class DisputeQuestionResponse implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ DisputeQuestionResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UUID getNextQuestionId();

    public abstract DisputeQuestionnaire.Question getQuestion();

    private DisputeQuestionResponse() {
    }

    /* compiled from: DisputeQuestionResponse.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Text;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "nextQuestionId", "Ljava/util/UUID;", "answerText", "", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;Ljava/util/UUID;Ljava/lang/String;)V", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "getNextQuestionId", "()Ljava/util/UUID;", "getAnswerText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Text extends DisputeQuestionResponse {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Text> CREATOR = new Creator();
        private final String answerText;
        private final UUID nextQuestionId;
        private final DisputeQuestionnaire.Question question;

        /* compiled from: DisputeQuestionResponse.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Text> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text((DisputeQuestionnaire.Question) parcel.readParcelable(Text.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i) {
                return new Text[i];
            }
        }

        public static /* synthetic */ Text copy$default(Text text, DisputeQuestionnaire.Question question, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                question = text.question;
            }
            if ((i & 2) != 0) {
                uuid = text.nextQuestionId;
            }
            if ((i & 4) != 0) {
                str = text.answerText;
            }
            return text.copy(question, uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAnswerText() {
            return this.answerText;
        }

        public final Text copy(DisputeQuestionnaire.Question question, UUID nextQuestionId, String answerText) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answerText, "answerText");
            return new Text(question, nextQuestionId, answerText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.question, text.question) && Intrinsics.areEqual(this.nextQuestionId, text.nextQuestionId) && Intrinsics.areEqual(this.answerText, text.answerText);
        }

        public int hashCode() {
            int iHashCode = this.question.hashCode() * 31;
            UUID uuid = this.nextQuestionId;
            return ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.answerText.hashCode();
        }

        public String toString() {
            return "Text(question=" + this.question + ", nextQuestionId=" + this.nextQuestionId + ", answerText=" + this.answerText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeSerializable(this.nextQuestionId);
            dest.writeString(this.answerText);
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        public final String getAnswerText() {
            return this.answerText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(DisputeQuestionnaire.Question question, UUID uuid, String answerText) {
            super(null);
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answerText, "answerText");
            this.question = question;
            this.nextQuestionId = uuid;
            this.answerText = answerText;
        }
    }

    /* compiled from: DisputeQuestionResponse.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Decimal;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "nextQuestionId", "Ljava/util/UUID;", "moneyAmount", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;Ljava/util/UUID;Lcom/robinhood/models/util/Money;)V", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "getNextQuestionId", "()Ljava/util/UUID;", "getMoneyAmount", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Decimal extends DisputeQuestionResponse {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Decimal> CREATOR = new Creator();
        private final Money moneyAmount;
        private final UUID nextQuestionId;
        private final DisputeQuestionnaire.Question question;

        /* compiled from: DisputeQuestionResponse.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Decimal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Decimal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Decimal((DisputeQuestionnaire.Question) parcel.readParcelable(Decimal.class.getClassLoader()), (UUID) parcel.readSerializable(), (Money) parcel.readParcelable(Decimal.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Decimal[] newArray(int i) {
                return new Decimal[i];
            }
        }

        public static /* synthetic */ Decimal copy$default(Decimal decimal, DisputeQuestionnaire.Question question, UUID uuid, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                question = decimal.question;
            }
            if ((i & 2) != 0) {
                uuid = decimal.nextQuestionId;
            }
            if ((i & 4) != 0) {
                money = decimal.moneyAmount;
            }
            return decimal.copy(question, uuid, money);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getMoneyAmount() {
            return this.moneyAmount;
        }

        public final Decimal copy(DisputeQuestionnaire.Question question, UUID nextQuestionId, Money moneyAmount) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(moneyAmount, "moneyAmount");
            return new Decimal(question, nextQuestionId, moneyAmount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Decimal)) {
                return false;
            }
            Decimal decimal = (Decimal) other;
            return Intrinsics.areEqual(this.question, decimal.question) && Intrinsics.areEqual(this.nextQuestionId, decimal.nextQuestionId) && Intrinsics.areEqual(this.moneyAmount, decimal.moneyAmount);
        }

        public int hashCode() {
            int iHashCode = this.question.hashCode() * 31;
            UUID uuid = this.nextQuestionId;
            return ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.moneyAmount.hashCode();
        }

        public String toString() {
            return "Decimal(question=" + this.question + ", nextQuestionId=" + this.nextQuestionId + ", moneyAmount=" + this.moneyAmount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeSerializable(this.nextQuestionId);
            dest.writeParcelable(this.moneyAmount, flags);
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        public final Money getMoneyAmount() {
            return this.moneyAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Decimal(DisputeQuestionnaire.Question question, UUID uuid, Money moneyAmount) {
            super(null);
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(moneyAmount, "moneyAmount");
            this.question = question;
            this.nextQuestionId = uuid;
            this.moneyAmount = moneyAmount;
        }
    }

    /* compiled from: DisputeQuestionResponse.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001c¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Date;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "question", "Ljava/util/UUID;", "nextQuestionId", "j$/time/LocalDate", "answerDate", "", "answerText", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;Ljava/util/UUID;Lj$/time/LocalDate;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "component2", "()Ljava/util/UUID;", "component3", "()Lj$/time/LocalDate;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;Ljava/util/UUID;Lj$/time/LocalDate;Ljava/lang/String;)Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Date;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "getQuestion", "Ljava/util/UUID;", "getNextQuestionId", "Lj$/time/LocalDate;", "getAnswerDate", "Ljava/lang/String;", "getAnswerText", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Date extends DisputeQuestionResponse {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Date> CREATOR = new Creator();
        private final LocalDate answerDate;
        private final String answerText;
        private final UUID nextQuestionId;
        private final DisputeQuestionnaire.Question question;

        /* compiled from: DisputeQuestionResponse.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Date> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Date createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Date((DisputeQuestionnaire.Question) parcel.readParcelable(Date.class.getClassLoader()), (UUID) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Date[] newArray(int i) {
                return new Date[i];
            }
        }

        public static /* synthetic */ Date copy$default(Date date, DisputeQuestionnaire.Question question, UUID uuid, LocalDate localDate, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                question = date.question;
            }
            if ((i & 2) != 0) {
                uuid = date.nextQuestionId;
            }
            if ((i & 4) != 0) {
                localDate = date.answerDate;
            }
            if ((i & 8) != 0) {
                str = date.answerText;
            }
            return date.copy(question, uuid, localDate, str);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        /* renamed from: component3, reason: from getter */
        public final LocalDate getAnswerDate() {
            return this.answerDate;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnswerText() {
            return this.answerText;
        }

        public final Date copy(DisputeQuestionnaire.Question question, UUID nextQuestionId, LocalDate answerDate, String answerText) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answerDate, "answerDate");
            Intrinsics.checkNotNullParameter(answerText, "answerText");
            return new Date(question, nextQuestionId, answerDate, answerText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Date)) {
                return false;
            }
            Date date = (Date) other;
            return Intrinsics.areEqual(this.question, date.question) && Intrinsics.areEqual(this.nextQuestionId, date.nextQuestionId) && Intrinsics.areEqual(this.answerDate, date.answerDate) && Intrinsics.areEqual(this.answerText, date.answerText);
        }

        public int hashCode() {
            int iHashCode = this.question.hashCode() * 31;
            UUID uuid = this.nextQuestionId;
            return ((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.answerDate.hashCode()) * 31) + this.answerText.hashCode();
        }

        public String toString() {
            return "Date(question=" + this.question + ", nextQuestionId=" + this.nextQuestionId + ", answerDate=" + this.answerDate + ", answerText=" + this.answerText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeSerializable(this.nextQuestionId);
            dest.writeSerializable(this.answerDate);
            dest.writeString(this.answerText);
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        public final LocalDate getAnswerDate() {
            return this.answerDate;
        }

        public final String getAnswerText() {
            return this.answerText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Date(DisputeQuestionnaire.Question question, UUID uuid, LocalDate answerDate, String answerText) {
            super(null);
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answerDate, "answerDate");
            Intrinsics.checkNotNullParameter(answerText, "answerText");
            this.question = question;
            this.nextQuestionId = uuid;
            this.answerDate = answerDate;
            this.answerText = answerText;
        }
    }

    /* compiled from: DisputeQuestionResponse.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Media;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "nextQuestionId", "Ljava/util/UUID;", "files", "", "Lcom/robinhood/android/cash/disputes/util/DisputeFileData;", "answerText", "", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;Ljava/util/UUID;Ljava/util/List;Ljava/lang/String;)V", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "getNextQuestionId", "()Ljava/util/UUID;", "getFiles", "()Ljava/util/List;", "getAnswerText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Media extends DisputeQuestionResponse {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Media> CREATOR = new Creator();
        private final String answerText;
        private final List<DisputeFileData> files;
        private final UUID nextQuestionId;
        private final DisputeQuestionnaire.Question question;

        /* compiled from: DisputeQuestionResponse.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Media> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Media createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                DisputeQuestionnaire.Question question = (DisputeQuestionnaire.Question) parcel.readParcelable(Media.class.getClassLoader());
                UUID uuid = (UUID) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DisputeFileData.CREATOR.createFromParcel(parcel));
                }
                return new Media(question, uuid, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Media[] newArray(int i) {
                return new Media[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Media copy$default(Media media, DisputeQuestionnaire.Question question, UUID uuid, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                question = media.question;
            }
            if ((i & 2) != 0) {
                uuid = media.nextQuestionId;
            }
            if ((i & 4) != 0) {
                list = media.files;
            }
            if ((i & 8) != 0) {
                str = media.answerText;
            }
            return media.copy(question, uuid, list, str);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        public final List<DisputeFileData> component3() {
            return this.files;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnswerText() {
            return this.answerText;
        }

        public final Media copy(DisputeQuestionnaire.Question question, UUID nextQuestionId, List<DisputeFileData> files, String answerText) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(files, "files");
            return new Media(question, nextQuestionId, files, answerText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Media)) {
                return false;
            }
            Media media = (Media) other;
            return Intrinsics.areEqual(this.question, media.question) && Intrinsics.areEqual(this.nextQuestionId, media.nextQuestionId) && Intrinsics.areEqual(this.files, media.files) && Intrinsics.areEqual(this.answerText, media.answerText);
        }

        public int hashCode() {
            int iHashCode = this.question.hashCode() * 31;
            UUID uuid = this.nextQuestionId;
            int iHashCode2 = (((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.files.hashCode()) * 31;
            String str = this.answerText;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Media(question=" + this.question + ", nextQuestionId=" + this.nextQuestionId + ", files=" + this.files + ", answerText=" + this.answerText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeSerializable(this.nextQuestionId);
            List<DisputeFileData> list = this.files;
            dest.writeInt(list.size());
            Iterator<DisputeFileData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.answerText);
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        public final List<DisputeFileData> getFiles() {
            return this.files;
        }

        public final String getAnswerText() {
            return this.answerText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Media(DisputeQuestionnaire.Question question, UUID uuid, List<DisputeFileData> files, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(files, "files");
            this.question = question;
            this.nextQuestionId = uuid;
            this.files = files;
            this.answerText = str;
        }
    }

    /* compiled from: DisputeQuestionResponse.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0007J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$MultipleChoice;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "nextQuestionId", "Ljava/util/UUID;", "choiceIndex", "", "answerText", "", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;Ljava/util/UUID;ILjava/lang/String;)V", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "getNextQuestionId", "()Ljava/util/UUID;", "getChoiceIndex", "()I", "getAnswerText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MultipleChoice extends DisputeQuestionResponse {
        public static final int $stable = 8;
        public static final Parcelable.Creator<MultipleChoice> CREATOR = new Creator();
        private final String answerText;
        private final int choiceIndex;
        private final UUID nextQuestionId;
        private final DisputeQuestionnaire.Question question;

        /* compiled from: DisputeQuestionResponse.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultipleChoice> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoice createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultipleChoice((DisputeQuestionnaire.Question) parcel.readParcelable(MultipleChoice.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readInt(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoice[] newArray(int i) {
                return new MultipleChoice[i];
            }
        }

        public static /* synthetic */ MultipleChoice copy$default(MultipleChoice multipleChoice, DisputeQuestionnaire.Question question, UUID uuid, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                question = multipleChoice.question;
            }
            if ((i2 & 2) != 0) {
                uuid = multipleChoice.nextQuestionId;
            }
            if ((i2 & 4) != 0) {
                i = multipleChoice.choiceIndex;
            }
            if ((i2 & 8) != 0) {
                str = multipleChoice.answerText;
            }
            return multipleChoice.copy(question, uuid, i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getChoiceIndex() {
            return this.choiceIndex;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnswerText() {
            return this.answerText;
        }

        public final MultipleChoice copy(DisputeQuestionnaire.Question question, UUID nextQuestionId, int choiceIndex, String answerText) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answerText, "answerText");
            return new MultipleChoice(question, nextQuestionId, choiceIndex, answerText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleChoice)) {
                return false;
            }
            MultipleChoice multipleChoice = (MultipleChoice) other;
            return Intrinsics.areEqual(this.question, multipleChoice.question) && Intrinsics.areEqual(this.nextQuestionId, multipleChoice.nextQuestionId) && this.choiceIndex == multipleChoice.choiceIndex && Intrinsics.areEqual(this.answerText, multipleChoice.answerText);
        }

        public int hashCode() {
            int iHashCode = this.question.hashCode() * 31;
            UUID uuid = this.nextQuestionId;
            return ((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Integer.hashCode(this.choiceIndex)) * 31) + this.answerText.hashCode();
        }

        public String toString() {
            return "MultipleChoice(question=" + this.question + ", nextQuestionId=" + this.nextQuestionId + ", choiceIndex=" + this.choiceIndex + ", answerText=" + this.answerText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeSerializable(this.nextQuestionId);
            dest.writeInt(this.choiceIndex);
            dest.writeString(this.answerText);
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        public final int getChoiceIndex() {
            return this.choiceIndex;
        }

        public final String getAnswerText() {
            return this.answerText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleChoice(DisputeQuestionnaire.Question question, UUID uuid, int i, String answerText) {
            super(null);
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answerText, "answerText");
            this.question = question;
            this.nextQuestionId = uuid;
            this.choiceIndex = i;
            this.answerText = answerText;
        }
    }

    /* compiled from: DisputeQuestionResponse.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$DuplicateAuthorizedTransaction;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "nextQuestionId", "Ljava/util/UUID;", "authorizedTransaction", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;Ljava/util/UUID;Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;)V", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "getNextQuestionId", "()Ljava/util/UUID;", "getAuthorizedTransaction", "()Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DuplicateAuthorizedTransaction extends DisputeQuestionResponse {
        public static final int $stable = 8;
        public static final Parcelable.Creator<DuplicateAuthorizedTransaction> CREATOR = new Creator();
        private final SettledCardTransaction authorizedTransaction;
        private final UUID nextQuestionId;
        private final DisputeQuestionnaire.Question question;

        /* compiled from: DisputeQuestionResponse.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DuplicateAuthorizedTransaction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DuplicateAuthorizedTransaction createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DuplicateAuthorizedTransaction((DisputeQuestionnaire.Question) parcel.readParcelable(DuplicateAuthorizedTransaction.class.getClassLoader()), (UUID) parcel.readSerializable(), (SettledCardTransaction) parcel.readParcelable(DuplicateAuthorizedTransaction.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DuplicateAuthorizedTransaction[] newArray(int i) {
                return new DuplicateAuthorizedTransaction[i];
            }
        }

        public static /* synthetic */ DuplicateAuthorizedTransaction copy$default(DuplicateAuthorizedTransaction duplicateAuthorizedTransaction, DisputeQuestionnaire.Question question, UUID uuid, SettledCardTransaction settledCardTransaction, int i, Object obj) {
            if ((i & 1) != 0) {
                question = duplicateAuthorizedTransaction.question;
            }
            if ((i & 2) != 0) {
                uuid = duplicateAuthorizedTransaction.nextQuestionId;
            }
            if ((i & 4) != 0) {
                settledCardTransaction = duplicateAuthorizedTransaction.authorizedTransaction;
            }
            return duplicateAuthorizedTransaction.copy(question, uuid, settledCardTransaction);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        /* renamed from: component3, reason: from getter */
        public final SettledCardTransaction getAuthorizedTransaction() {
            return this.authorizedTransaction;
        }

        public final DuplicateAuthorizedTransaction copy(DisputeQuestionnaire.Question question, UUID nextQuestionId, SettledCardTransaction authorizedTransaction) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(authorizedTransaction, "authorizedTransaction");
            return new DuplicateAuthorizedTransaction(question, nextQuestionId, authorizedTransaction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DuplicateAuthorizedTransaction)) {
                return false;
            }
            DuplicateAuthorizedTransaction duplicateAuthorizedTransaction = (DuplicateAuthorizedTransaction) other;
            return Intrinsics.areEqual(this.question, duplicateAuthorizedTransaction.question) && Intrinsics.areEqual(this.nextQuestionId, duplicateAuthorizedTransaction.nextQuestionId) && Intrinsics.areEqual(this.authorizedTransaction, duplicateAuthorizedTransaction.authorizedTransaction);
        }

        public int hashCode() {
            int iHashCode = this.question.hashCode() * 31;
            UUID uuid = this.nextQuestionId;
            return ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.authorizedTransaction.hashCode();
        }

        public String toString() {
            return "DuplicateAuthorizedTransaction(question=" + this.question + ", nextQuestionId=" + this.nextQuestionId + ", authorizedTransaction=" + this.authorizedTransaction + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeSerializable(this.nextQuestionId);
            dest.writeParcelable(this.authorizedTransaction, flags);
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        public final SettledCardTransaction getAuthorizedTransaction() {
            return this.authorizedTransaction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DuplicateAuthorizedTransaction(DisputeQuestionnaire.Question question, UUID uuid, SettledCardTransaction authorizedTransaction) {
            super(null);
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(authorizedTransaction, "authorizedTransaction");
            this.question = question;
            this.nextQuestionId = uuid;
            this.authorizedTransaction = authorizedTransaction;
        }
    }

    /* compiled from: DisputeQuestionResponse.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Skip;", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "nextQuestionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;Ljava/util/UUID;)V", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "getNextQuestionId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Skip extends DisputeQuestionResponse {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Skip> CREATOR = new Creator();
        private final UUID nextQuestionId;
        private final DisputeQuestionnaire.Question question;

        /* compiled from: DisputeQuestionResponse.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Skip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Skip createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Skip((DisputeQuestionnaire.Question) parcel.readParcelable(Skip.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Skip[] newArray(int i) {
                return new Skip[i];
            }
        }

        public static /* synthetic */ Skip copy$default(Skip skip, DisputeQuestionnaire.Question question, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                question = skip.question;
            }
            if ((i & 2) != 0) {
                uuid = skip.nextQuestionId;
            }
            return skip.copy(question, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        public final Skip copy(DisputeQuestionnaire.Question question, UUID nextQuestionId) {
            Intrinsics.checkNotNullParameter(question, "question");
            return new Skip(question, nextQuestionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Skip)) {
                return false;
            }
            Skip skip = (Skip) other;
            return Intrinsics.areEqual(this.question, skip.question) && Intrinsics.areEqual(this.nextQuestionId, skip.nextQuestionId);
        }

        public int hashCode() {
            int iHashCode = this.question.hashCode() * 31;
            UUID uuid = this.nextQuestionId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "Skip(question=" + this.question + ", nextQuestionId=" + this.nextQuestionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeSerializable(this.nextQuestionId);
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public DisputeQuestionnaire.Question getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse
        public UUID getNextQuestionId() {
            return this.nextQuestionId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Skip(DisputeQuestionnaire.Question question, UUID uuid) {
            super(null);
            Intrinsics.checkNotNullParameter(question, "question");
            this.question = question;
            this.nextQuestionId = uuid;
        }
    }
}
