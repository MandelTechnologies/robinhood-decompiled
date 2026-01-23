package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.stripe.android.core.model.StripeModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Source.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b9\b\u0087\b\u0018\u0000 e2\u00020\u00012\u00020\u0002:\tfeghijklmB\u0089\u0002\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020+HÖ\u0001¢\u0006\u0004\b1\u0010-J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020+HÖ\u0001¢\u0006\u0004\b6\u00107R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bA\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\bB\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\b\u000f\u0010GR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\bR\u0010SR'\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\bZ\u0010*R\u0017\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b[\u0010*R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010_R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010`R\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\bd\u0010*¨\u0006n"}, m3636d2 = {"Lcom/stripe/android/model/Source;", "Lcom/stripe/android/core/model/StripeModel;", "", "", "id", "", "amount", "clientSecret", "Lcom/stripe/android/model/Source$CodeVerification;", "codeVerification", "created", "currency", "Lcom/stripe/android/model/Source$Flow;", "flow", "", "isLiveMode", "Lcom/stripe/android/model/Source$Owner;", "owner", "Lcom/stripe/android/model/Source$Receiver;", "receiver", "Lcom/stripe/android/model/Source$Redirect;", "redirect", "Lcom/stripe/android/model/Source$Status;", "status", "", "sourceTypeData", "Lcom/stripe/android/model/SourceTypeModel;", "sourceTypeModel", "type", "typeRaw", "Lcom/stripe/android/model/Source$Usage;", "usage", "Lcom/stripe/android/model/WeChat;", "_weChat", "Lcom/stripe/android/model/Source$Klarna;", "_klarna", "Lcom/stripe/android/model/SourceOrder;", "sourceOrder", "statementDescriptor", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "getClientSecret", "Lcom/stripe/android/model/Source$CodeVerification;", "getCodeVerification", "()Lcom/stripe/android/model/Source$CodeVerification;", "getCreated", "getCurrency", "Lcom/stripe/android/model/Source$Flow;", "getFlow", "()Lcom/stripe/android/model/Source$Flow;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/stripe/android/model/Source$Owner;", "getOwner", "()Lcom/stripe/android/model/Source$Owner;", "Lcom/stripe/android/model/Source$Receiver;", "getReceiver", "()Lcom/stripe/android/model/Source$Receiver;", "Lcom/stripe/android/model/Source$Redirect;", "getRedirect", "()Lcom/stripe/android/model/Source$Redirect;", "Lcom/stripe/android/model/Source$Status;", "getStatus", "()Lcom/stripe/android/model/Source$Status;", "Ljava/util/Map;", "getSourceTypeData", "()Ljava/util/Map;", "Lcom/stripe/android/model/SourceTypeModel;", "getSourceTypeModel", "()Lcom/stripe/android/model/SourceTypeModel;", "getType", "getTypeRaw", "Lcom/stripe/android/model/Source$Usage;", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "Lcom/stripe/android/model/WeChat;", "Lcom/stripe/android/model/Source$Klarna;", "Lcom/stripe/android/model/SourceOrder;", "getSourceOrder", "()Lcom/stripe/android/model/SourceOrder;", "getStatementDescriptor", "Companion", "CodeVerification", "Flow", "Klarna", "Owner", "Receiver", "Redirect", "Status", "Usage", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Source implements StripeModel, Parcelable {
    private final Klarna _klarna;
    private final WeChat _weChat;
    private final Long amount;
    private final String clientSecret;
    private final CodeVerification codeVerification;
    private final Long created;
    private final String currency;
    private final Flow flow;
    private final String id;
    private final Boolean isLiveMode;
    private final Owner owner;
    private final Receiver receiver;
    private final Redirect redirect;
    private final SourceOrder sourceOrder;
    private final Map<String, Object> sourceTypeData;
    private final SourceTypeModel sourceTypeModel;
    private final String statementDescriptor;
    private final Status status;
    private final String type;
    private final String typeRaw;
    private final Usage usage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Source> CREATOR = new Creator();

    /* compiled from: Source.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<Source> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            CodeVerification codeVerificationCreateFromParcel = parcel.readInt() == 0 ? null : CodeVerification.CREATOR.createFromParcel(parcel);
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            Flow flowValueOf = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            int i = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Owner ownerCreateFromParcel = parcel.readInt() == 0 ? null : Owner.CREATOR.createFromParcel(parcel);
            Receiver receiverCreateFromParcel = parcel.readInt() == 0 ? null : Receiver.CREATOR.createFromParcel(parcel);
            Redirect redirectCreateFromParcel = parcel.readInt() == 0 ? null : Redirect.CREATOR.createFromParcel(parcel);
            Status statusValueOf = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                while (i != i2) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(Source.class.getClassLoader()));
                    i++;
                    boolValueOf = boolValueOf;
                    string2 = string2;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Source(string2, lValueOf, string3, codeVerificationCreateFromParcel, lValueOf2, string4, flowValueOf, boolValueOf, ownerCreateFromParcel, receiverCreateFromParcel, redirectCreateFromParcel, statusValueOf, linkedHashMap, (SourceTypeModel) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : WeChat.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Klarna.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SourceOrder.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source[] newArray(int i) {
            return new Source[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Source)) {
            return false;
        }
        Source source = (Source) other;
        return Intrinsics.areEqual(this.id, source.id) && Intrinsics.areEqual(this.amount, source.amount) && Intrinsics.areEqual(this.clientSecret, source.clientSecret) && Intrinsics.areEqual(this.codeVerification, source.codeVerification) && Intrinsics.areEqual(this.created, source.created) && Intrinsics.areEqual(this.currency, source.currency) && this.flow == source.flow && Intrinsics.areEqual(this.isLiveMode, source.isLiveMode) && Intrinsics.areEqual(this.owner, source.owner) && Intrinsics.areEqual(this.receiver, source.receiver) && Intrinsics.areEqual(this.redirect, source.redirect) && this.status == source.status && Intrinsics.areEqual(this.sourceTypeData, source.sourceTypeData) && Intrinsics.areEqual(this.sourceTypeModel, source.sourceTypeModel) && Intrinsics.areEqual(this.type, source.type) && Intrinsics.areEqual(this.typeRaw, source.typeRaw) && this.usage == source.usage && Intrinsics.areEqual(this._weChat, source._weChat) && Intrinsics.areEqual(this._klarna, source._klarna) && Intrinsics.areEqual(this.sourceOrder, source.sourceOrder) && Intrinsics.areEqual(this.statementDescriptor, source.statementDescriptor);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.amount;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.clientSecret;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CodeVerification codeVerification = this.codeVerification;
        int iHashCode4 = (iHashCode3 + (codeVerification == null ? 0 : codeVerification.hashCode())) * 31;
        Long l2 = this.created;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Flow flow = this.flow;
        int iHashCode7 = (iHashCode6 + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.isLiveMode;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Owner owner = this.owner;
        int iHashCode9 = (iHashCode8 + (owner == null ? 0 : owner.hashCode())) * 31;
        Receiver receiver = this.receiver;
        int iHashCode10 = (iHashCode9 + (receiver == null ? 0 : receiver.hashCode())) * 31;
        Redirect redirect = this.redirect;
        int iHashCode11 = (iHashCode10 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        Status status = this.status;
        int iHashCode12 = (iHashCode11 + (status == null ? 0 : status.hashCode())) * 31;
        Map<String, Object> map = this.sourceTypeData;
        int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        SourceTypeModel sourceTypeModel = this.sourceTypeModel;
        int iHashCode14 = (((((iHashCode13 + (sourceTypeModel == null ? 0 : sourceTypeModel.hashCode())) * 31) + this.type.hashCode()) * 31) + this.typeRaw.hashCode()) * 31;
        Usage usage = this.usage;
        int iHashCode15 = (iHashCode14 + (usage == null ? 0 : usage.hashCode())) * 31;
        WeChat weChat = this._weChat;
        int iHashCode16 = (iHashCode15 + (weChat == null ? 0 : weChat.hashCode())) * 31;
        Klarna klarna = this._klarna;
        int iHashCode17 = (iHashCode16 + (klarna == null ? 0 : klarna.hashCode())) * 31;
        SourceOrder sourceOrder = this.sourceOrder;
        int iHashCode18 = (iHashCode17 + (sourceOrder == null ? 0 : sourceOrder.hashCode())) * 31;
        String str4 = this.statementDescriptor;
        return iHashCode18 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Source(id=" + this.id + ", amount=" + this.amount + ", clientSecret=" + this.clientSecret + ", codeVerification=" + this.codeVerification + ", created=" + this.created + ", currency=" + this.currency + ", flow=" + this.flow + ", isLiveMode=" + this.isLiveMode + ", owner=" + this.owner + ", receiver=" + this.receiver + ", redirect=" + this.redirect + ", status=" + this.status + ", sourceTypeData=" + this.sourceTypeData + ", sourceTypeModel=" + this.sourceTypeModel + ", type=" + this.type + ", typeRaw=" + this.typeRaw + ", usage=" + this.usage + ", _weChat=" + this._weChat + ", _klarna=" + this._klarna + ", sourceOrder=" + this.sourceOrder + ", statementDescriptor=" + this.statementDescriptor + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        Long l = this.amount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.clientSecret);
        CodeVerification codeVerification = this.codeVerification;
        if (codeVerification == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            codeVerification.writeToParcel(parcel, flags);
        }
        Long l2 = this.created;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.currency);
        Flow flow = this.flow;
        if (flow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(flow.name());
        }
        Boolean bool = this.isLiveMode;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Owner owner = this.owner;
        if (owner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            owner.writeToParcel(parcel, flags);
        }
        Receiver receiver = this.receiver;
        if (receiver == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            receiver.writeToParcel(parcel, flags);
        }
        Redirect redirect = this.redirect;
        if (redirect == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            redirect.writeToParcel(parcel, flags);
        }
        Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        Map<String, Object> map = this.sourceTypeData;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeValue(entry.getValue());
            }
        }
        parcel.writeParcelable(this.sourceTypeModel, flags);
        parcel.writeString(this.type);
        parcel.writeString(this.typeRaw);
        Usage usage = this.usage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        WeChat weChat = this._weChat;
        if (weChat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            weChat.writeToParcel(parcel, flags);
        }
        Klarna klarna = this._klarna;
        if (klarna == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            klarna.writeToParcel(parcel, flags);
        }
        SourceOrder sourceOrder = this.sourceOrder;
        if (sourceOrder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sourceOrder.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.statementDescriptor);
    }

    public Source(String str, Long l, String str2, CodeVerification codeVerification, Long l2, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map<String, ? extends Object> map, SourceTypeModel sourceTypeModel, String type2, String typeRaw, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str4) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        this.id = str;
        this.amount = l;
        this.clientSecret = str2;
        this.codeVerification = codeVerification;
        this.created = l2;
        this.currency = str3;
        this.flow = flow;
        this.isLiveMode = bool;
        this.owner = owner;
        this.receiver = receiver;
        this.redirect = redirect;
        this.status = status;
        this.sourceTypeData = map;
        this.sourceTypeModel = sourceTypeModel;
        this.type = type2;
        this.typeRaw = typeRaw;
        this.usage = usage;
        this._weChat = weChat;
        this._klarna = klarna;
        this.sourceOrder = sourceOrder;
        this.statementDescriptor = str4;
    }

    public String getId() {
        return this.id;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final Flow getFlow() {
        return this.flow;
    }

    public final Redirect getRedirect() {
        return this.redirect;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/model/Source$Status;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Canceled", "Chargeable", "Consumed", "Failed", "Pending", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private final String code;
        public static final Status Canceled = new Status("Canceled", 0, "canceled");
        public static final Status Chargeable = new Status("Chargeable", 1, "chargeable");
        public static final Status Consumed = new Status("Consumed", 2, "consumed");
        public static final Status Failed = new Status("Failed", 3, "failed");
        public static final Status Pending = new Status("Pending", 4, "pending");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{Canceled, Chargeable, Consumed, Failed, Pending};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        private Status(String str, int i, String str2) {
            this.code = str2;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/Source$Usage;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "toString", "Reusable", "SingleUse", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Usage {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Usage[] $VALUES;
        public static final Usage Reusable = new Usage("Reusable", 0, "reusable");
        public static final Usage SingleUse = new Usage("SingleUse", 1, "single_use");
        private final String code;

        private static final /* synthetic */ Usage[] $values() {
            return new Usage[]{Reusable, SingleUse};
        }

        public static EnumEntries<Usage> getEntries() {
            return $ENTRIES;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) $VALUES.clone();
        }

        private Usage(String str, int i, String str2) {
            this.code = str2;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        static {
            Usage[] usageArr$values = $values();
            $VALUES = usageArr$values;
            $ENTRIES = EnumEntries2.enumEntries(usageArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/model/Source$Flow;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "toString", "Redirect", "Receiver", "CodeVerification", "None", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Flow {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Flow[] $VALUES;
        private final String code;
        public static final Flow Redirect = new Flow("Redirect", 0, "redirect");
        public static final Flow Receiver = new Flow("Receiver", 1, "receiver");
        public static final Flow CodeVerification = new Flow("CodeVerification", 2, "code_verification");
        public static final Flow None = new Flow("None", 3, ApiRenderablePlatforms.VERSIONS_NONE);

        private static final /* synthetic */ Flow[] $values() {
            return new Flow[]{Redirect, Receiver, CodeVerification, None};
        }

        public static EnumEntries<Flow> getEntries() {
            return $ENTRIES;
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) $VALUES.clone();
        }

        private Flow(String str, int i, String str2) {
            this.code = str2;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        static {
            Flow[] flowArr$values = $values();
            $VALUES = flowArr$values;
            $ENTRIES = EnumEntries2.enumEntries(flowArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\n¨\u0006!"}, m3636d2 = {"Lcom/stripe/android/model/Source$Redirect;", "Lcom/stripe/android/core/model/StripeModel;", "", "returnUrl", "Lcom/stripe/android/model/Source$Redirect$Status;", "status", "url", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/Source$Redirect$Status;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getReturnUrl", "Lcom/stripe/android/model/Source$Redirect$Status;", "getStatus", "()Lcom/stripe/android/model/Source$Redirect$Status;", "getUrl", "Status", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Redirect implements StripeModel {
        public static final Parcelable.Creator<Redirect> CREATOR = new Creator();
        private final String returnUrl;
        private final Status status;
        private final String url;

        /* compiled from: Source.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Redirect> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Redirect createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Redirect(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Redirect[] newArray(int i) {
                return new Redirect[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) other;
            return Intrinsics.areEqual(this.returnUrl, redirect.returnUrl) && this.status == redirect.status && Intrinsics.areEqual(this.url, redirect.url);
        }

        public int hashCode() {
            String str = this.returnUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Status status = this.status;
            int iHashCode2 = (iHashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.url;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Redirect(returnUrl=" + this.returnUrl + ", status=" + this.status + ", url=" + this.url + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.returnUrl);
            Status status = this.status;
            if (status == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(status.name());
            }
            parcel.writeString(this.url);
        }

        public Redirect(String str, Status status, String str2) {
            this.returnUrl = str;
            this.status = status;
            this.url = str2;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Source.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/Source$Redirect$Status;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Pending", "Succeeded", "NotRequired", "Failed", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            private final String code;
            public static final Status Pending = new Status("Pending", 0, "pending");
            public static final Status Succeeded = new Status("Succeeded", 1, "succeeded");
            public static final Status NotRequired = new Status("NotRequired", 2, "not_required");
            public static final Status Failed = new Status("Failed", 3, "failed");

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{Pending, Succeeded, NotRequired, Failed};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }

            private Status(String str, int i, String str2) {
                this.code = str2;
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
                INSTANCE = new Companion(null);
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.code;
            }
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/Source$CodeVerification;", "Lcom/stripe/android/core/model/StripeModel;", "", "attemptsRemaining", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "status", "<init>", "(ILcom/stripe/android/model/Source$CodeVerification$Status;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getAttemptsRemaining", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "getStatus", "()Lcom/stripe/android/model/Source$CodeVerification$Status;", "Status", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class CodeVerification implements StripeModel {
        public static final Parcelable.Creator<CodeVerification> CREATOR = new Creator();
        private final int attemptsRemaining;
        private final Status status;

        /* compiled from: Source.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CodeVerification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodeVerification createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CodeVerification(parcel.readInt(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodeVerification[] newArray(int i) {
                return new CodeVerification[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CodeVerification)) {
                return false;
            }
            CodeVerification codeVerification = (CodeVerification) other;
            return this.attemptsRemaining == codeVerification.attemptsRemaining && this.status == codeVerification.status;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.attemptsRemaining) * 31;
            Status status = this.status;
            return iHashCode + (status == null ? 0 : status.hashCode());
        }

        public String toString() {
            return "CodeVerification(attemptsRemaining=" + this.attemptsRemaining + ", status=" + this.status + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.attemptsRemaining);
            Status status = this.status;
            if (status == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(status.name());
            }
        }

        public CodeVerification(int i, Status status) {
            this.attemptsRemaining = i;
            this.status = status;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Source.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Pending", "Succeeded", "Failed", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            private final String code;
            public static final Status Pending = new Status("Pending", 0, "pending");
            public static final Status Succeeded = new Status("Succeeded", 1, "succeeded");
            public static final Status Failed = new Status("Failed", 2, "failed");

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{Pending, Succeeded, Failed};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }

            private Status(String str, int i, String str2) {
                this.code = str2;
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
                INSTANCE = new Companion(null);
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.code;
            }
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/model/Source$Receiver;", "Lcom/stripe/android/core/model/StripeModel;", "", PlaceTypes.ADDRESS, "", "amountCharged", "amountReceived", "amountReturned", "<init>", "(Ljava/lang/String;JJJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAddress", "J", "getAmountCharged", "()J", "getAmountReceived", "getAmountReturned", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Receiver implements StripeModel {
        public static final Parcelable.Creator<Receiver> CREATOR = new Creator();
        private final String address;
        private final long amountCharged;
        private final long amountReceived;
        private final long amountReturned;

        /* compiled from: Source.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Receiver> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Receiver createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Receiver(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Receiver[] newArray(int i) {
                return new Receiver[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Receiver)) {
                return false;
            }
            Receiver receiver = (Receiver) other;
            return Intrinsics.areEqual(this.address, receiver.address) && this.amountCharged == receiver.amountCharged && this.amountReceived == receiver.amountReceived && this.amountReturned == receiver.amountReturned;
        }

        public int hashCode() {
            String str = this.address;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.amountCharged)) * 31) + Long.hashCode(this.amountReceived)) * 31) + Long.hashCode(this.amountReturned);
        }

        public String toString() {
            return "Receiver(address=" + this.address + ", amountCharged=" + this.amountCharged + ", amountReceived=" + this.amountReceived + ", amountReturned=" + this.amountReturned + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.address);
            parcel.writeLong(this.amountCharged);
            parcel.writeLong(this.amountReceived);
            parcel.writeLong(this.amountReturned);
        }

        public Receiver(String str, long j, long j2, long j3) {
            this.address = str;
            this.amountCharged = j;
            this.amountReceived = j2;
            this.amountReturned = j3;
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BY\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b(\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b)\u0010\u000f¨\u0006*"}, m3636d2 = {"Lcom/stripe/android/model/Source$Owner;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/Address;", PlaceTypes.ADDRESS, "", "email", "name", "phone", "verifiedAddress", "verifiedEmail", "verifiedName", "verifiedPhone", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Address;", "getAddress", "()Lcom/stripe/android/model/Address;", "Ljava/lang/String;", "getEmail", "getName", "getPhone", "getVerifiedAddress", "getVerifiedEmail", "getVerifiedName", "getVerifiedPhone", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Owner implements StripeModel {
        public static final Parcelable.Creator<Owner> CREATOR = new Creator();
        private final Address address;
        private final String email;
        private final String name;
        private final String phone;
        private final Address verifiedAddress;
        private final String verifiedEmail;
        private final String verifiedName;
        private final String verifiedPhone;

        /* compiled from: Source.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Owner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Owner createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Owner(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Owner[] newArray(int i) {
                return new Owner[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) other;
            return Intrinsics.areEqual(this.address, owner.address) && Intrinsics.areEqual(this.email, owner.email) && Intrinsics.areEqual(this.name, owner.name) && Intrinsics.areEqual(this.phone, owner.phone) && Intrinsics.areEqual(this.verifiedAddress, owner.verifiedAddress) && Intrinsics.areEqual(this.verifiedEmail, owner.verifiedEmail) && Intrinsics.areEqual(this.verifiedName, owner.verifiedName) && Intrinsics.areEqual(this.verifiedPhone, owner.verifiedPhone);
        }

        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Address address2 = this.verifiedAddress;
            int iHashCode5 = (iHashCode4 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str4 = this.verifiedEmail;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.verifiedName;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.verifiedPhone;
            return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Owner(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ", verifiedAddress=" + this.verifiedAddress + ", verifiedEmail=" + this.verifiedEmail + ", verifiedName=" + this.verifiedName + ", verifiedPhone=" + this.verifiedPhone + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            Address address2 = this.verifiedAddress;
            if (address2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.verifiedEmail);
            parcel.writeString(this.verifiedName);
            parcel.writeString(this.verifiedPhone);
        }

        public Owner(Address address, String str, String str2, String str3, Address address2, String str4, String str5, String str6) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
            this.verifiedAddress = address2;
            this.verifiedEmail = str4;
            this.verifiedName = str5;
            this.verifiedPhone = str6;
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b2\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b3\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b4\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b5\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b6\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b7\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b8\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b9\u0010\u0019R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b=\u0010<¨\u0006>"}, m3636d2 = {"Lcom/stripe/android/model/Source$Klarna;", "Lcom/stripe/android/core/model/StripeModel;", "", "firstName", "lastName", "purchaseCountry", "clientToken", "payNowAssetUrlsDescriptive", "payNowAssetUrlsStandard", "payNowName", "payNowRedirectUrl", "payLaterAssetUrlsDescriptive", "payLaterAssetUrlsStandard", "payLaterName", "payLaterRedirectUrl", "payOverTimeAssetUrlsDescriptive", "payOverTimeAssetUrlsStandard", "payOverTimeName", "payOverTimeRedirectUrl", "", "paymentMethodCategories", "customPaymentMethods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFirstName", "getLastName", "getPurchaseCountry", "getClientToken", "getPayNowAssetUrlsDescriptive", "getPayNowAssetUrlsStandard", "getPayNowName", "getPayNowRedirectUrl", "getPayLaterAssetUrlsDescriptive", "getPayLaterAssetUrlsStandard", "getPayLaterName", "getPayLaterRedirectUrl", "getPayOverTimeAssetUrlsDescriptive", "getPayOverTimeAssetUrlsStandard", "getPayOverTimeName", "getPayOverTimeRedirectUrl", "Ljava/util/Set;", "getPaymentMethodCategories", "()Ljava/util/Set;", "getCustomPaymentMethods", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Klarna implements StripeModel {
        public static final Parcelable.Creator<Klarna> CREATOR = new Creator();
        private final String clientToken;
        private final Set<String> customPaymentMethods;
        private final String firstName;
        private final String lastName;
        private final String payLaterAssetUrlsDescriptive;
        private final String payLaterAssetUrlsStandard;
        private final String payLaterName;
        private final String payLaterRedirectUrl;
        private final String payNowAssetUrlsDescriptive;
        private final String payNowAssetUrlsStandard;
        private final String payNowName;
        private final String payNowRedirectUrl;
        private final String payOverTimeAssetUrlsDescriptive;
        private final String payOverTimeAssetUrlsStandard;
        private final String payOverTimeName;
        private final String payOverTimeRedirectUrl;
        private final Set<String> paymentMethodCategories;
        private final String purchaseCountry;

        /* compiled from: Source.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Klarna> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Klarna createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int i2 = 0;
                while (i2 != i) {
                    linkedHashSet.add(parcel.readString());
                    i2++;
                    i = i;
                }
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                int i4 = 0;
                while (i4 != i3) {
                    linkedHashSet2.add(parcel.readString());
                    i4++;
                    i3 = i3;
                }
                return new Klarna(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, linkedHashSet, linkedHashSet2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Klarna[] newArray(int i) {
                return new Klarna[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Klarna)) {
                return false;
            }
            Klarna klarna = (Klarna) other;
            return Intrinsics.areEqual(this.firstName, klarna.firstName) && Intrinsics.areEqual(this.lastName, klarna.lastName) && Intrinsics.areEqual(this.purchaseCountry, klarna.purchaseCountry) && Intrinsics.areEqual(this.clientToken, klarna.clientToken) && Intrinsics.areEqual(this.payNowAssetUrlsDescriptive, klarna.payNowAssetUrlsDescriptive) && Intrinsics.areEqual(this.payNowAssetUrlsStandard, klarna.payNowAssetUrlsStandard) && Intrinsics.areEqual(this.payNowName, klarna.payNowName) && Intrinsics.areEqual(this.payNowRedirectUrl, klarna.payNowRedirectUrl) && Intrinsics.areEqual(this.payLaterAssetUrlsDescriptive, klarna.payLaterAssetUrlsDescriptive) && Intrinsics.areEqual(this.payLaterAssetUrlsStandard, klarna.payLaterAssetUrlsStandard) && Intrinsics.areEqual(this.payLaterName, klarna.payLaterName) && Intrinsics.areEqual(this.payLaterRedirectUrl, klarna.payLaterRedirectUrl) && Intrinsics.areEqual(this.payOverTimeAssetUrlsDescriptive, klarna.payOverTimeAssetUrlsDescriptive) && Intrinsics.areEqual(this.payOverTimeAssetUrlsStandard, klarna.payOverTimeAssetUrlsStandard) && Intrinsics.areEqual(this.payOverTimeName, klarna.payOverTimeName) && Intrinsics.areEqual(this.payOverTimeRedirectUrl, klarna.payOverTimeRedirectUrl) && Intrinsics.areEqual(this.paymentMethodCategories, klarna.paymentMethodCategories) && Intrinsics.areEqual(this.customPaymentMethods, klarna.customPaymentMethods);
        }

        public int hashCode() {
            String str = this.firstName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.purchaseCountry;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.clientToken;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.payNowAssetUrlsDescriptive;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.payNowAssetUrlsStandard;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.payNowName;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.payNowRedirectUrl;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.payLaterAssetUrlsDescriptive;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.payLaterAssetUrlsStandard;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.payLaterName;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.payLaterRedirectUrl;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.payOverTimeAssetUrlsDescriptive;
            int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.payOverTimeAssetUrlsStandard;
            int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.payOverTimeName;
            int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.payOverTimeRedirectUrl;
            return ((((iHashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.paymentMethodCategories.hashCode()) * 31) + this.customPaymentMethods.hashCode();
        }

        public String toString() {
            return "Klarna(firstName=" + this.firstName + ", lastName=" + this.lastName + ", purchaseCountry=" + this.purchaseCountry + ", clientToken=" + this.clientToken + ", payNowAssetUrlsDescriptive=" + this.payNowAssetUrlsDescriptive + ", payNowAssetUrlsStandard=" + this.payNowAssetUrlsStandard + ", payNowName=" + this.payNowName + ", payNowRedirectUrl=" + this.payNowRedirectUrl + ", payLaterAssetUrlsDescriptive=" + this.payLaterAssetUrlsDescriptive + ", payLaterAssetUrlsStandard=" + this.payLaterAssetUrlsStandard + ", payLaterName=" + this.payLaterName + ", payLaterRedirectUrl=" + this.payLaterRedirectUrl + ", payOverTimeAssetUrlsDescriptive=" + this.payOverTimeAssetUrlsDescriptive + ", payOverTimeAssetUrlsStandard=" + this.payOverTimeAssetUrlsStandard + ", payOverTimeName=" + this.payOverTimeName + ", payOverTimeRedirectUrl=" + this.payOverTimeRedirectUrl + ", paymentMethodCategories=" + this.paymentMethodCategories + ", customPaymentMethods=" + this.customPaymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.firstName);
            parcel.writeString(this.lastName);
            parcel.writeString(this.purchaseCountry);
            parcel.writeString(this.clientToken);
            parcel.writeString(this.payNowAssetUrlsDescriptive);
            parcel.writeString(this.payNowAssetUrlsStandard);
            parcel.writeString(this.payNowName);
            parcel.writeString(this.payNowRedirectUrl);
            parcel.writeString(this.payLaterAssetUrlsDescriptive);
            parcel.writeString(this.payLaterAssetUrlsStandard);
            parcel.writeString(this.payLaterName);
            parcel.writeString(this.payLaterRedirectUrl);
            parcel.writeString(this.payOverTimeAssetUrlsDescriptive);
            parcel.writeString(this.payOverTimeAssetUrlsStandard);
            parcel.writeString(this.payOverTimeName);
            parcel.writeString(this.payOverTimeRedirectUrl);
            Set<String> set = this.paymentMethodCategories;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
            Set<String> set2 = this.customPaymentMethods;
            parcel.writeInt(set2.size());
            Iterator<String> it2 = set2.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next());
            }
        }

        public Klarna(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set<String> paymentMethodCategories, Set<String> customPaymentMethods) {
            Intrinsics.checkNotNullParameter(paymentMethodCategories, "paymentMethodCategories");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            this.firstName = str;
            this.lastName = str2;
            this.purchaseCountry = str3;
            this.clientToken = str4;
            this.payNowAssetUrlsDescriptive = str5;
            this.payNowAssetUrlsStandard = str6;
            this.payNowName = str7;
            this.payNowRedirectUrl = str8;
            this.payLaterAssetUrlsDescriptive = str9;
            this.payLaterAssetUrlsStandard = str10;
            this.payLaterName = str11;
            this.payLaterRedirectUrl = str12;
            this.payOverTimeAssetUrlsDescriptive = str13;
            this.payOverTimeAssetUrlsStandard = str14;
            this.payOverTimeName = str15;
            this.payOverTimeRedirectUrl = str16;
            this.paymentMethodCategories = paymentMethodCategories;
            this.customPaymentMethods = customPaymentMethods;
        }
    }

    /* compiled from: Source.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/model/Source$Companion;", "", "<init>", "()V", "", "sourceType", "asSourceType", "(Ljava/lang/String;)Ljava/lang/String;", "EURO", "Ljava/lang/String;", "USD", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @JvmStatic
        public final String asSourceType(String sourceType) {
            if (sourceType != null) {
                switch (sourceType.hashCode()) {
                    case -1920743119:
                        if (sourceType.equals("bancontact")) {
                            return "bancontact";
                        }
                        break;
                    case -1414960566:
                        if (sourceType.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -896955097:
                        if (sourceType.equals("sofort")) {
                            return "sofort";
                        }
                        break;
                    case -825238221:
                        if (sourceType.equals("three_d_secure")) {
                            return "three_d_secure";
                        }
                        break;
                    case -791770330:
                        if (sourceType.equals("wechat")) {
                            return "wechat";
                        }
                        break;
                    case -284840886:
                        sourceType.equals("unknown");
                        break;
                    case 100648:
                        if (sourceType.equals("eps")) {
                            return "eps";
                        }
                        break;
                    case 109234:
                        if (sourceType.equals("p24")) {
                            return "p24";
                        }
                        break;
                    case 3046160:
                        if (sourceType.equals("card")) {
                            return "card";
                        }
                        break;
                    case 38358441:
                        if (sourceType.equals("giropay")) {
                            return "giropay";
                        }
                        break;
                    case 100048981:
                        if (sourceType.equals("ideal")) {
                            return "ideal";
                        }
                        break;
                    case 1251821346:
                        if (sourceType.equals("multibanco")) {
                            return "multibanco";
                        }
                        break;
                    case 1636477296:
                        if (sourceType.equals("sepa_debit")) {
                            return "sepa_debit";
                        }
                        break;
                }
            }
            return "unknown";
        }
    }
}
